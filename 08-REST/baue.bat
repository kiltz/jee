call mvn package -Dmaven.test.skip=true
pause
copy target\08-rest-1.0.0.0-SNAPSHOT.war %JBOSS_HOME%\standalone\deployments\rest.war
