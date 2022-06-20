set EUREKA_PATH=%~dp0
pushd %EUREKA_PATH%

call mvn clean package -f EurekaServer
call mvn clean package -f EurekaClient
call mvn clean package -f EurekaFeignClient
