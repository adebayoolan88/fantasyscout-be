#!/bin/bash
echo "Stopping Spring Boot app if running..."
pkill -f fantasyscout-0.0.1-SNAPSHOT.jar || true
