package com.gaoji

fun main(args: Array<String>) {

    for(item in list){
        println(item);
    }

    println(list.maxBy { it.age })
    println(list.minBy { it.age })
    println(list.filter { it.name == "李四" }) // 可以使用and
    println(list.map { "${it.name} ${it.address}"})

//    list.any {  }
//    list.any()//
//    list.count {  } //
//    list.any { }
//    list.groupBy {  }  // 分组
//    list.find {  }
}
