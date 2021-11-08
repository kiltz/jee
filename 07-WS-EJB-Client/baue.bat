call mvn package -Dmaven.test.skip=true
pause
copy target\07-ws-EJB-Client-1.0.0.0-SNAPSHOT.jar %JBOSS_HOME%\standalone\deployments\WS-EJB-Client.jar
