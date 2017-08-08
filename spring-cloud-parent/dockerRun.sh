#!/bin/bash
cd sc-service
mvn package docker:build -DskipTests

cd ..
cd sc-service-client
mvn package docker:build -DskipTests

cd ..
docker-compose up