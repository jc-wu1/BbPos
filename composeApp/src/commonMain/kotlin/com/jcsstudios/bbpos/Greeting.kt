package com.jcsstudios.bbpos

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hallo, ${platform.name}!"
    }
}