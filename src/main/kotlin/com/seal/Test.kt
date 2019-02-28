package com.seal

fun main(args: Array<String>) {
    var x1 = Son.小小驴()
    var x2 = Son.小小骡()

    var list = listOf<Son>(x1,x2)
    for(item in list){
        if (item is Son.小小骡){
            item.sayHello()
        }
    }

}