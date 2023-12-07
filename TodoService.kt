package com.lcwd.todo.service

import com.lcwd.todo.entities.Todo

interface TodoService {
    fun createTodo(todo: Todo):Todo
    fun updateTodo(todoId:String,todo:Todo):Todo
    fun deleteTodo(todoId:String)
    fun getAllTodos():List<Todo>
    fun getTodo(todoId:String):Todo
}