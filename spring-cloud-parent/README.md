Discovery Server: http://localhost:8761/

Microservice : http://localhost:8083/ping

Microservice (client with Load Balacing and Circuit Breaker ): http://localhost:8081/greeting

Microservice over proxy: http://localhost:9999/sc-service-client/greeting acme/password

Service Trace with Zipkin: http://localhost:9411/

Circuit Breakers Monitor: http://localhost:8082/hystrix/monitor?stream=http://localhost:8082/turbine.stream

Docker commands for postgres 

$ docker run --name postgres -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres

$ docker run -it --rm --link postgres:postgres postgres psql -h postgres -U postgres

