call mvn package -Dmaven.test.skip=true
pause
copy target\07-ws-1.0.0.0-SNAPSHOT.jar %JBOSS_HOME%\standalone\deployments\WS.jar
