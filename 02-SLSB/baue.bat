call mvn package -Dmaven.test.skip=true
pause
copy target\02-slsb-1.0.0.0-SNAPSHOT.jar %JBOSS_HOME%\standalone\deployments\SLSB.jar
