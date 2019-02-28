package com.seal

// 小母驴 ，小公驴，小公马的儿子

sealed class Son {
 // sealed 限定的类为子类为有限个数

    fun sayHello(){
        println("大家好")
    }

    class 小小驴():Son()
    class 小小骡():Son()

}

