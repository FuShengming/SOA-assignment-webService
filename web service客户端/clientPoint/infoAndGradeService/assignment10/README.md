# 第十次作业

## 概述
本次作业主要为一下两部分内容
1. 通过start from wsdl的方式实现作业7、8设计的服务
2. 通过start from java的方式实现邮箱登录服务

本次作业共计要实现4个服务
1. GradeService，提供学生成绩管理CRUD服务
2. PersonInfoService，提供学生个人信息管理CRUD服务
3. AccountService，提供学生账户认证服务，主要为学生权限的查询
4. LoginService，提供邮箱登录服务

服务代码的概况如下
1. 代码框架均为idea生成的webService框架，以便于后期的tomcat部署

2. 前三个服务基于start from wsdl的方式，通过使用jdk自带的wsimport工具自动生成，使用命令如下：
    wsimport -encoding utf-8 -keep -s src -generateJWS -implDestDir src -Xnocompile Account.wsdl
    具体释义为：代码生成采用utf-8编码，保留生成的源文件且目录为src，生成服务实现代码且目录为src，不编译生成的源文件，指定wsdl文件

3. 代码生成后，将会有相应的schema对象类以及wsdl实现包，wsdl实现主要通过若干定义好的fault类、服务接口类xxxInterface、服务实现类xxx_xxxEndpointImpl、服务获取类xxxService，这几个类组成

4. 代码生成后，需在服务实现类中编写具体的业务接口实现代码，必要时需添加辅助的类；同时服务实现类中注解的wsdllocation属性应删除，避免出现问题

5. 服务的发布主要通过Java的Endpoint类来实现，具体编码写于ServicePublisher中

6. 服务的测试主要通过服务获取类xxxService获取指定url发布的服务，然后调用相应的方法进行测试，具体编码写于TestService类中

## 注意事项
1. 代码运行请将Java编译等级和包等级均设为8
2. 代码中有较多中文，但是由于Java支持utf-8编码，所以中文的使用并不影响代码的编译和运行
3. 代码运行需先运行服务发布的代码，然后再运行服务测试的代码

详细的作业解释以及服务实现参见相应目录下的ReadMe

