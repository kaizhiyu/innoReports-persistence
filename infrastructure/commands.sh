#!/usr/bin/env bash

git clone -b develop git@github.com:nethmihetti/innoReports-persistence --depth=1
cd innoReports-persistence

docker build --no-cache -f infrastructure/Dockerfile -t persistenceserviceentity .

sudo docker run -d -p 8082:8082 persistenceserviceentity:latest

