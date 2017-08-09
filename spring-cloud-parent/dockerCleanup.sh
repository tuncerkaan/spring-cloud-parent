#!/bin/bash
#Kill all running containers
docker-compose kill

# Delete all containers
docker rm -f $(docker ps -a -q)

# Delete all images
docker rmi -f $(docker images -q)