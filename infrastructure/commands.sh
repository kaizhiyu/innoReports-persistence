#!/usr/bin/env bash

git clone -b develop git@github.com:nethmihetti/innoReports-persistence --depth=1
cd service

docker build --no-cache -f infrastructure/Dockerfile -t persistenceserviceentity .

sudo docker run -d -p 8080:8080 persistenceserviceentity:latest

