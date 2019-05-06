package com.google.kotlin.section7

fun main(args: Array<String>) {

    // Immutable List: FIXED Size, READ Only

    // INDEX:                          0      1       2
    var namesList = listOf<String>("Peter", "Sam", "Alex")

    for (name in namesList) {
        println(name)
    }

    // OR
    println()

    for (index in 0..namesList.size - 1) {
        println(namesList[index])       // OR namesList.get(index)
    }

}