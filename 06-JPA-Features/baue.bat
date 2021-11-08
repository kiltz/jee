call mvn package -Dmaven.test.skip=true
pause
copy target\06-JPA-Features-1.0.0.0-SNAPSHOT.jar %JBOSS_HOME%\standalone\deployments\JPA-Features.jar
