# Web Service服务端项目

#### 项目说明

##### 一、概述

​	本项目为2020年服务计算与SOA开发课程web service服务端实现。

​	本项目使用Springboot与CXF框架实现，实现和发布学生信息管理服务、学生成绩管理服务、权限认证服务、邮箱登录身份认证服务。

**二、** **项目描述**

​	本项目使用Springboot+CXF开发，使用mysql数据库。

​	项目bl目录下为web service的接口类。

​	blImpl目录下为web service的接口实现类。

​	entity目录下为实体类与错误类以及package-info名空间配置类。

​	Config目录下为配置类，配置CXF Servlet、服务的endpoint以及服务实现类的bean注入方法。

​	dao目录下为使用了Spring Data Jpa技术的Repository类，用于数据库操作。

​	JpaEntity目录下为与数据库表对应的领域对象类。

​	resources目录下存放服务相关的wsdl与xml schema文档以及初始化数据库的.sql脚本。

​	**学生信息管理服务与学生成绩管理服务分别提供了对学生信息和学生成绩的增删改查服务；学生权限认证服务提供输入正确学号密码后返回此学生所有的权限列表服务；邮箱登录服务提供使用邮箱密码进行登录并进行身份（本科生、研究生、老师）认证的服务。**

​	**注：邮箱Login服务中密码默认为邮箱的@符前的字符串。对于123456@smail.nju.edu.cn密码即为123456。本科生邮箱默认为smail.nju.edu.cn结尾，研究生默认为jmail.nju.edu.cn结尾，老师默认为以nju.edu.cn结尾。**

**三、 开发流程描述**

​	对于学生信息管理服务、学生成绩管理服务、学生权限认证服务，采用start from wsdl模式。由于由wsdl生成java类的Wsimport工具不支持wsdl2.0标准，故先将原有作业wsdl改为wsdl1.1标准。而后使用Idea集成的Wsimport工具由wsdl生成对应的实体类、错误类与服务接口类。如下图所示。

![1](.\screenshot\1.png)

​	编写实现类，实现生成的服务接口。

![2](.\screenshot\2.png)

​	编写数据库表脚本，初始化数据库表，配置Jpa以及数据库连接信息，编写数据库表对应的领域对象以及JpaRepository类。

![3](.\screenshot\3.png)

​	编写CXF配置类，用于拦截webservice请求路由与发布endpoint。

![4](.\screenshot\4.png)

​	邮箱Login服务采用start from java模式，先编写定义相关数据结构的xml schema（Login.xsd），再自己编写对应的实体类、错误类、服务接口与接口实现类，并在CXF配置类中配置其发布路径。

**四、 项目使用与注意事项**

​	本项目启动类为DemoApplication类。在启动前要注意先按照自己的配置，修改resources目录下的application.properties配置文件中的mysql地址和用户密码配置，并在mysql中用source命令导入resources目录下的db.sql文件初始化数据库表。

​	服务中学生信息服务发布地址为localhost:8080/ws/studentInfo。

学生成绩服务发布地址为localhost:8080/ws/score。

学生权限认证服务发布地址为localhost:8080/ws/authority。

邮箱登录服务的发布地址为localhost:8080/ws/login。

​	导入db.sql后，学生权限认证服务数据库中存有学号为171250640，密码为123456的账户初始数据。此账户有门禁编号为000001和000002的门禁权限，书籍编号为123456789和123457890的借书权限的初始数据。

​	使用截图（使用Postman测试）：

**添加学生信息：**

![5](.\screenshot\5.png)

**通过学号查找学生信息：**

![6](.\screenshot\6.png)

**（删除与修改学生信息略）**

**添加学生成绩列表：**

![7](.\screenshot\7.png)

**根据学号查找学生成绩列表：**

![8](.\screenshot\8.png)

**（删除与修改学生成绩略）**

**学生权限认证服务**：

![9](C:\Users\82582\Desktop\SOA\test2\assignment10\screenshot\9.png)

**邮箱登录并身份认证服务：**

![10](.\screenshot\10.png)

**错误处理**

**添加学生信息时学号对应学生信息已存在：**

![11](.\screenshot\11.png)

**根据学号查找学生成绩时学生成绩不存在**

![12](.\screenshot\12.png)

**学生权限认证时密码错误：**

![13](.\screenshot\13.png)

**(其他错误略)**