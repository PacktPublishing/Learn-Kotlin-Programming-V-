package com.google.kotlin.section7

fun main(args: Array<String>) {

    // Mutable List: NO FIXED Size, READ and WRITE

    // INDEX:                               0      1       2
//    var namesList = mutableListOf<String>("Peter", "Sam", "Alex")
    var namesList = arrayListOf<String>("Peter", "Sam", "Alex")     // Same a above
    namesList.add("Austin")     // 3
    namesList.add("Teena")      // 4

//    namesList.removeAt(1)         // Remove element at index of 1
//    namesList.remove("Sam")       // Remove "Sam" from List

    namesList[2] = "Christina"      // Replace element at index 2 by "Christina"

//    namesList.clear()             // Delete all elements of List

    for (name in namesList) {
        println(name)
    }
}