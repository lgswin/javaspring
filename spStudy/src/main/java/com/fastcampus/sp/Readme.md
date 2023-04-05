# Tips

### tomcat 서버 port 변경 (sts3 에 있는 server.xml Path 임)
\workspace-sts-3.9.17.RELEASE\Servers\Tomcat v9.0 Server at localhost-config\server.xml
```xml
    <Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
```
->  80번으로 변경하면 기본 포트라 port 번호를 붙이지 않아도 됨.
```xml
    <Connector port="80" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
```

