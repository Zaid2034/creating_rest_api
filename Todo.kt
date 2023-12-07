package com.lcwd.todo.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name="todos")
data class Todo(
    @Id
    var id:String="",
    @Column(name="todo_title",length=500)
    var title:String,
    var author:String,
){
    constructor():this("","","") {

    }

}
