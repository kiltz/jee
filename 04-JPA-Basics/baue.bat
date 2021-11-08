call mvn package -Dmaven.test.skip=true
pause
copy target\04-JPA-Basics-1.0.0.0-SNAPSHOT.jar %JBOSS_HOME%\standalone\deployments\JPA-Basics.jar
