package com.json

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken



fun main() {
    var str = """
     [
          {
            "name": "张三",
            "sex": "男",
            "age": 20
          },
          {
            "name": "李四",
            "sex": "男",
            "age": 22
          },
          {
            "name": "王五",
            "sex": "女",
            "age": 24
          }
    ]
   """.trimIndent()


    //println(Gson().fromJson(str,User::class.java)) // 转成对象

    //转成列表
    //写法（多行）
//    var users: List<User>
//    val listType = object : TypeToken<ArrayList<User>>() {}.type
//    users = Gson().fromJson(str, listType)
    // 写成一行
    val users:List<User> = Gson().fromJson(str, object : TypeToken<List<User>>() {}.type)
    users.forEach {
        println("name= "+ it.name )
    }
}