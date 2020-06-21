#!/bin/bash

docker run -it --rm -v $(pwd):$(pwd) -w $(pwd) maven:3.6-jdk-8-alpine \
  bash -c 'mvn -e -B dependency:resolve; mvn -e -B package'