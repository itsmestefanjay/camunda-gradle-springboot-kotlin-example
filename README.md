## General
This project builds a springboot application based on kotlin with an embedded camunda engine and a sample process

## Process
* the process consist of a `timer starter event` which triggers every 10s and a `service task`
* the `service task` calls a Kotlin impl of a `JavaDelegate` which logs some output

## Dependencies
* Kotlin 1.6.+
* Springboot 2.5.+
* Camunda 7.16

## Plugins
* the plugin `org.jetbrains.kotlin.plugin.spring` is a wrapper on top of all-open, and it behaves exactly the same way

## Build
Run `gradlew bootRun` to build and start the application