call mvn package -Dmaven.test.skip=true
pause
copy target\09-jms-mdb-1.0.0.0-SNAPSHOT.jar %JBOSS_HOME%\standalone\deployments\JMS-MDB.jar
