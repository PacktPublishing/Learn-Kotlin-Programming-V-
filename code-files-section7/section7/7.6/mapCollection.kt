package com.google.kotlin.section7

fun main(args: Array<String>) {

    // Immutable Map: Fixed Size, READ Only
    var myMap = mapOf<Int, String>( 2 to "USA", 5 to "India", 1 to "China" )
    for (key in myMap.keys) {
        println(myMap.get(key))     // myMap[key]
    }

    println()

    // Mutable Map: No Fixed Size, READ and WRITE both

//    var myMutableMap = mutableMapOf<Int, String>()
    var myMutableMap = hashMapOf<Int, String>()     // Same as above
    myMutableMap.put(2, "USA")          // myMutableMap[2] = "USA"
    myMutableMap.put(5, "India")
    myMutableMap.put(1, "China")

//    myMutableMap.remove(5)

    myMutableMap.replace(5, "Nepal")

    for (key in myMutableMap.keys) {
        println(myMutableMap.get(key))     // myMutableMap[key]
    }

}