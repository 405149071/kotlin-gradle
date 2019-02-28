package com.gaoji

data class Girl(var name:String,var age:Int,var address:String);

var list = listOf<Girl>(
        Girl("张三",18,"辽宁"),
        Girl("李四",28,"辽宁"),
        Girl("王五",48,"北京")
)

//DSL 领域特定语言

fun List<Girl>.查找嫩妹子(age: Int){
    filter {
        it.age > age
    }.forEach(::println)
}

// 中缀表达式 , 使用时可以用空格代替.

infix fun List<Girl>.查找嫩妹子小于(age: Int){
    filter {
        it.age < age
    }.forEach(::println)
}
