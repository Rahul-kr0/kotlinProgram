package com.example.kotlinlearn


fun main() {

//  List = Lists store items in the order that they are added, and allow for duplicate items.
//  To create a read-only list (List), use the listOf() function.

    val shape = listOf("Triangle","Circle","Trapizium");
    println(shape[0])

//    Set = sets are unordered and only store unique items.
//    To create a read-only set (Set), use the setOf() function.

    val user = setOf("Rahul","Arun","Sujeet","Sourav")
    println(user)

//   As sets are unordered, you can't access an item at a particular index.
//    println(user[0])

// Map = Maps store items as key-value pairs.
// You access the value by referencing the key.
// You can imagine a map like a food menu. You can find the price (value), by finding the food (key) you want to eat.
// Maps are useful if you want to look up a value without using a numbered index, like in a list

   val userId = mapOf("Rahul" to 1,"Arun" to 2, "Sujeet" to 3, "Sourav" to 4)
    println(userId)

//To access a value in a map, use the indexed access operator [] with its key:

    print(userId["Rahul"])
}