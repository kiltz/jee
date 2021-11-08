call mvn package -Dmaven.test.skip=true
pause
copy target\03-sfsb-1.0.0.0-SNAPSHOT.jar %JBOSS_HOME%\standalone\deployments\SFSB.jar
