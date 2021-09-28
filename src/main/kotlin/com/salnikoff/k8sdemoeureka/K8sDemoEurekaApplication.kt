package com.salnikoff.k8sdemoeureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class K8sDemoEurekaApplication

fun main(args: Array<String>) {
    runApplication<K8sDemoEurekaApplication>(*args)
}