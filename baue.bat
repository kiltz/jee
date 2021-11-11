call mvn package -Dmaven.test.skip=true
pause
copy kv-ear\target\kv.ear %JBOSS_HOME%\standalone\deployments\kv.ear
