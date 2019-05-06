package com.google.kotlin.section4

fun main(args: Array<String>) {

    var remote: Remote = Television()
    remote.powerOn()
    remote.powerOff()
    remote.brand = "Sansui"
    remote.about()
}

interface Remote {

    var brand: String   // Abstract property

    fun powerOn()      // Abstract method has no method body or code

    fun powerOff()     // Abstract method has no method body or code

    fun about() {       // Normal Method Declaration: OPTIONAL to override
        println("I am Remote interface")
    }
}

class Television: Remote {

    override var brand: String = ""

    override fun powerOn() {
        println("The TV is now switched ON")
    }

    override fun powerOff() {
        println("The TV is now switched OFF")
    }

    override fun about() {
        println("I am a TV")
        super.about()
    }
}
