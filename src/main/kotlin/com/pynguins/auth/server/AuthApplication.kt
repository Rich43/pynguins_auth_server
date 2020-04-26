package com.pynguins.auth.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthApplication

fun main(args: Array<String>) {
	runApplication<AuthApplication>(*args)
}