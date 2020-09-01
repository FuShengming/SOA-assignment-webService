# 第十次作业——GradeService

## 概述

1. GradeService服务为作业8中设计的成绩管理服务，wsdl部分的内容即为GradeManagement.wsdl以及schemas目录下的xsd文件。
2. lib与web为idea的webservice框架自动生成的，可用于后期的tomcat部署
3. 通过使用jdk自带的wsimport工具，根据wsdl文件生成服务的java代码，主要代码均在src目录下。src/cn/....以下的内容为服务的具体代码，src目录下的ServicePublisher类和TestService类分别负责服务的发布与测试

## 业务实现

业务实现的具体代码均在GradeService_GradeServiceEndpointImpl类中。业务实现主要包含参数检验和具体CRUD实现两个部分。

### 1. 参数检验

对于服务的输入，需要进行格式的校验，如不符合schema规范，则需抛出invalidRequestFault。参数主要有学号和课程成绩列表类型两种。
1. 学号类型的参数通过简单的字符串长度比较进行格式校验（schema中定义的）
2. 课程成绩列表类型的校验，主要借助JAXB的marshal操作，在marshaller中设置schema校验，通过一次marshal的成功与否来判断输入的参数是否合格

### 2. 成绩管理业务CRUD
数据的存储通过简单的内存对象存储进行实现。
1. 搜索操作：主要实现即为对课程成绩类型对象的遍历，遇到学号相同的成绩则作保存，最后组织为课程成绩类型对象返回

2. 添加操作：在添加之前，需对已有数据进行一次遍历，判断待添加的数据是否已存在，若存在则需返回AlreadyExistFault。若均不存在，则执行插入操作

3. 修改操作：在修改之前，需对已有数据进行一次遍历，判断待修改的成绩项是否均在内存中，若有不存在的，则需返回CannotFindFault。若均存在，则对找到的成绩对象进行修改。

4. 删除操作：在修改之前，需对已有数据进行一次遍历，判断待删除的成绩项是否均在内存中，若有不存在的，则需返回CannotFindFault。若均存在，则执行删除操作。

