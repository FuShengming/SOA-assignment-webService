# Web Service客户端项目

### 项目概述

#### 一、 项目介绍

​	本项目为南京大学软件学院2017届服务计算与SOA课程web service客户端项目。本项目为web service的客户端编写，调用了服务端项目中完成的学生成绩服务、学生信息服务与邮箱Login服务。

#### 二、 项目结构与运行

​	本项目由三部分组成，目录分别对应为assignment11，infoAndGradeService，loginService。assignment11中为本次的web service客户端项目，infoAndGradeService中为assignment10中的学生信息与学生成绩服务项目，loginService中为assignment10的login服务项目。其中infoAndGradeService又由GradeService和PersonalInfoService两个项目组成。

​	运行本项目时，首先请启动loginService中的assignment10（login服务），与infoAndGradeService中的GradeService、PersonalInfoService。

​	loginService中的assignment10的启动类为DemoApplication，GradeService的启动类为ServicePublisher，PersonalInfoService的启动类为ServicePublisher。

​	三个服务都启动后，即可以运行客户端项目，启动类为webServiceClient包下的Client类，其中覆盖了包括学生信息服务、学生成绩服务、login权限验证服务以及错误处理的用例，详见Client类的main方法中的注释。

​	**客户端与服务端的所有消息保存在assignment11项目目录下的message文件中。**

​	**此外，由于GradeService与PersonalInfoService使用的是简单的内存存储，所以每次重新启动GradeService与PersonalInfoService都相当于将学生信息和学生成绩数据清空。**

#### 三、 项目详细介绍

​	本项目为web service的客户端。

​	首先使用学生信息服务、学生成绩服务、邮箱login服务的wsdl，使用jetbrain intellij idea的web service工具生成客户端接口类、实现类以及相关的实体对象（见下图）。

![1](.\screenshot\1.png)

![2](.\screenshot\2.png)

​	然后编写对应于上述每种服务实现类的客户端的服务类，即将学生信息服务、学生成绩服务、邮箱login服务再封装一层。服务类防御webServiceClient包下，为EmailLoginService类、InfoService类、ScoreService类。以ScoreService类举例，其调用了上图中生成的GradeService与GradeServiceInfterface，并指定其请求地址（与学生成绩服务项目的服务地址相同）。而因为成绩服务需要用soap消息头部携带的邮箱与密码进行权限验证，故还需要在ScoreService类的对应方法中将email与password两个字段加入soap消息的首部。（见下图）

指定请求地址：![3](.\screenshot\3.png)

向Header中添加Email与password：

![4](.\screenshot\4.png)

此外还需要添加异常处理：

![5](.\screenshot\5.png)

​	客户端服务类编写完成后编写Handler，放于Handler包下。PersistenceHandler负责将每个消息保存到文件（assignment11项目目录下的message文件）中，LoginHandler负责对成绩服务的相关消息调用邮箱login服务进行权限验证。InfoModifyHandler负责在学生成绩发生更新时，同步更新学生信息中的成绩列表。

LoginHandler中对Header中email与password的获取以及对Login服务的调用和权限验证:

![6](.\screenshot\6.png)

InfoModifyHandler中对学生信息的同步修改：

![7](.\screenshot\7.png)

​	编写完Handler后，编写xml配置文件并在对应的服务实现类上添加注解，以将编写好的Handler配置到每个服务上。xml配置文件放在allocation包下。其中，login-handler.xml配置了InfoModifyHandler、LoginHandler、PersistenceHandler，用于学生成绩服务，进行权限验证、学生信息的同步修改以及消息的持久化。

![8](.\screenshot\8.png)

​	message-handler.xml中配置了PersistenceHandler，用于Login服务与学生信息服务的消息持久化。

![11](.\screenshot\11.png)

​	在对应的服务实现类上添加@HandlerChain注解，利用xml配置文件将Handler配置到服务上。下图以ServerService包的GradeService类举例。

![9](.\screenshot\9.png)

​	最后编写webServiceClient包下的Client类的main方法以覆盖每个用例。

![10](.\screenshot\10.png)

#### 四、 运行截图

启动GradeService项目：

![12](.\screenshot\12.png)

启动PersonalInfoService项目：

![13](.\screenshot\13.png)

启动Login服务：

![14](.\screenshot\14.png)

运行assignment11的Client类main方法：

![15](.\screenshot\15.png)

message文件中的消息记录：

![16](.\screenshot\16.png)