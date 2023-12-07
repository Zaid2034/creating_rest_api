package com.lcwd.todo.controller

import com.lcwd.todo.entities.Todo
import com.lcwd.todo.service.TodoService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class TodoController(val todoService: TodoService) {

    @PostMapping
    fun create(@RequestBody todo: Todo)=todoService.createTodo(todo)

    @PutMapping("/{todoId}")
    fun update(@PathVariable todoId:String,@RequestBody todo:Todo)=todoService.updateTodo(todoId, todo)

    @GetMapping
    fun getAll()=todoService.getAllTodos()
    @GetMapping("/{todoId}")
    fun getTodo(@PathVariable todoId:String)=todoService.getTodo(todoId)

    @DeleteMapping("/{todoId}")
    fun delete(@PathVariable todoId:String)=todoService.deleteTodo(todoId)


}