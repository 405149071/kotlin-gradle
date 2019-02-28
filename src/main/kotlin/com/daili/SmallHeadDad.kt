package com.daili

// 代理，有问题，headson被实例化多次
class SmallHeadDad:IWashbowl by BigHeadSon() {
    override fun washing(){
        println("让我儿子去洗碗")
        BigHeadSon().washing()
        println("看着儿子洗完啦，赚啦9块钱");

    }
}