#!/bin/sh

mvn clean install package

docker build . -t boko
