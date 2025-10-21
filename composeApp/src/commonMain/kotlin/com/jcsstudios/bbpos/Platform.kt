package com.jcsstudios.bbpos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform