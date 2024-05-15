package com.example.kotlinlearn

fun main() {

    val obj = calc();
    obj.add(5,7);

}

class calc{

    fun add(x:Int , y:Int){
        println(x+y);
    }

    fun sub(x:Int , y:Int){
        println(x-y);
    }

    fun multiply(x:Int , y:Int){
        println(x*y);
    }

}