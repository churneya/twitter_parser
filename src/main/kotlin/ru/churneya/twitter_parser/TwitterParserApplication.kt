package ru.churneya.twitter_parser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TwitterParserApplication

fun main(args: Array<String>) {
    runApplication<TwitterParserApplication>(*args)
}
