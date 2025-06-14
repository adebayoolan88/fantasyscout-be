#!/bin/bash
echo "Starting Spring Boot app..."
cd /home/ec2-user/deploy
nohup java -jar fantasyscout-0.0.1-SNAPSHOT.jar > app.log 2>&1 &
