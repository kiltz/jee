mkdir src\main\generated
mkdir build\classes

wsimport -keep -s src/main/generated -d build/classes http://127.0.0.1:8080/WS/DomainServiceImpl?wsdl
wsimport -keep -s src/main/generated -d build/classes http://127.0.0.1:8080/WS/BasicWebServiceImpl?wsdl

pause
