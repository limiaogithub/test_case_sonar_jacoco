# test_case_sonar_jacoco
<h2>1.介绍</h2>
Sonar是一个用于代码质量管理的开源平台，用于管理源代码的质量，可以从七个维度检测代码质量.</br>
Sonar可以集成jacoco运行单元测试的代码覆盖率</br>

<h2>2.准备</h2>
安装Sonar请参考官网https://www.sonarqube.org/</br>
注意以下几点：
64位系统，请安装64位jdk</br>
依赖Mysql5.6+</br>

<h2>3.本工程</h2>
本工程是一个样例工程，可参考pom.xml和sonar-project.properties配置</br>
</br>
mvn clean install sonar:sonar -Dsonar.issuesReport.html.enable=true -Dsonar.host.url=http://localhost:9000 -Dsonar.login={your key}</br>


![Alt text](https://github.com/limiaogithub/test_case_sonar_jacoco/blob/master/1.png)

![Alt text](https://github.com/limiaogithub/test_case_sonar_jacoco/blob/master/2.png)


