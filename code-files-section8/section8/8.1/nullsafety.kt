package com.google.kotlin.section8

fun main(args: Array<String>) {

    // WAP to find out length of name
    val name: String? = "Peter"

    // 1. Safe Call ( ?. )
        // Use it when you don't mind getting value as NULL
    println("The length of name is ${name?.length}")


    // 2. Safe Call with let ( ?.let )
        // It executes the block ONLY IF name is NOT NULL
    name?.let {
        println("The length of name is ${name.length}")
    }


    // 3. Non-null assertion operator ( !! )
        // Use it when you are sure the value is NOT NULL
        // Throws NullPointerException if the value is found to be NULL
    println("The length of name is ${name!!.length}")
}