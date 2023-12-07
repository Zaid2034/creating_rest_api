package com.lcwd.todo.repositories

import com.lcwd.todo.entities.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository:JpaRepository<Todo,String>
