FROM tomcat:8.5.11-jre8-alpine
#删除自带项目,rm -rf  r表示递归,f表示强制删除
RUN rm -rf /usr/local/tomcat/webapps
#添加war包到tomcat目录
ADD ./target/ROOT.war /usr/local/tomcat/webapps/ROOT.war
