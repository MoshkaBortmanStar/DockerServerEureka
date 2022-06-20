There is example of Eureka netflix claude, with kotlin and spring boot
for more comfortability have added docker-compose

start mvn-build.bat
after docker-compose up --build

after waite a minute

check http://localhost:8761 you must see file 2 services in eureka server

check  http://localhost:8080/get-greeting
you must see "Hello from SPRING-CLOUD-EUREKA-CLIENT!"


