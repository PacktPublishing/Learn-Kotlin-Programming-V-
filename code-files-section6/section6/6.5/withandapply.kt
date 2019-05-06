package com.google.kotlin.section6

fun main(args: Array<String>) {

    var person = Person()

    with(person) {
        name = "Peter"
        age = 27
    }

    person.startRun()

    println(person.name)
    println(person.age)

    person.apply {
        name = "Evan"
        age = 23
    }.startRun()

    println(person.name)
    println(person.age)
}

class Person {

    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("I am ready to run")
    }
}
