package com.bjs
import kotlinx.coroutines.*
class coroutines {
}
fun main()=runBlocking{
    launch{
        delay(1000L)
        println("coroutines")
    }
    println("hello ")
    delay(2000L)
}