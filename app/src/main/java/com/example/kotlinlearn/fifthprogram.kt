package com.example.kotlinlearn

import androidx.core.app.NotificationCompat.MessagingStyle.Message
import kotlinx.coroutines.processNextEventInCurrentThread
import kotlin.math.PI


fun main(){
    hello();
    println(sum(5,7));
    println(circle(2));
    printmsg("Hello")
}

fun hello(){
    println("Hello Function");

}

fun sum(x: Int , y: Int): Int
{
 return x + y;
}

fun printmsg(message: String){
    println(message);
}

fun circle(radius:Int):Double{
    return PI*radius*radius;
}

