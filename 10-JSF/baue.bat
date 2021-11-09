call mvn package -Dmaven.test.skip=true
pause
copy target\10-jsf-1.0.0.0-SNAPSHOT.war %JBOSS_HOME%\standalone\deployments\jsf.war
