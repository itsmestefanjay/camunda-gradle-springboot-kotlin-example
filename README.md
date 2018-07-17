## General
This project builds a springboot application based on kotlin with an embedded camunda engine and a sample process

## Plugins
* the plugin `org.jetbrains.kotlin.plugin.allopen` annotates Kotlin classes to be open
* the plugin `org.jetbrains.kotlin.plugin.spring` is a wrapper on top of all-open, and it behaves exactly the same way

## Build
Run `gradlew bootRun` to build and start the application