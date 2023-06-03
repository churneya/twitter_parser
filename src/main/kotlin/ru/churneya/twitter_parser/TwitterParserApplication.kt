package ru.churneya.twitter_parser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class TwitterParserApplication

fun main(args: Array<String>) {
    runApplication<TwitterParserApplication>(*args)
}
