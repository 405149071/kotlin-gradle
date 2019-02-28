package com.dataclass

data class User (var id: Int, var name: String)

fun main(args: Array<String>) {
    var user: User = User(123,"liuliqianxiao")
    var user2: User = User(123,"liuliqianxiao")
    println(user.hashCode())
    println(user2.hashCode())
    println(user.equals(user2))// true
}