package com.google.kotlin.section8

fun main(args: Array<String>) {

    val camera = Camera()
    camera.openCamera()
    camera.takePicture()
    camera.applyFilter()    // The function becomes the part of Camera class
    camera.saveThePic()
}

fun Camera.applyFilter() {      // Extension Function
    println("Gloss Filter applied !")
}


// Camera App
class Camera {

    fun openCamera() {
        println("Camera is now opened")
    }

    fun takePicture() {
        println("Picture Clicked! Time to Save it!")
    }

    fun saveThePic() {
        println("Picture Saved to sdcard/DCIM")
    }
}
