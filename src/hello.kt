fun main(args:Array<String>){
    println("hello kitin");

    var p = Person("zs",12);
    p.smile();
}


// obj

class Person(name:String,sex:Int){
    fun smile(){
        println("smile le ");
    }
}