package com.tun.macao

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform