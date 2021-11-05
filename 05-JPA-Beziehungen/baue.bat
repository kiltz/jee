call mvn package -Dmaven.test.skip=true
pause
copy target\05-JPA-Beziehungen-1.0.0.0-SNAPSHOT.jar %JBOSS_HOME%\standalone\deployments\JPA-Beziehungen.jar
