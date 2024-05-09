package com.example.kotlinlearn

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`);
    println("Is it raining outside yes or no!")
    val a:String = scanner.nextLine();
    if (a == "yes" || a == "Yes"){
        println("Bring the Umbrella");
    }else if(a == "no" || a == "No"){
            println("Do not bring the Umbrella");
        }else{
            println("Wrong Answer say yes or no");
    }
}