package com.lcwd.todo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoMangerApplication

fun main(args: Array<String>) {
	runApplication<TodoMangerApplication>(*args)
}
