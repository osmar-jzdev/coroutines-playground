package dgtic.unam.juego

import kotlin.concurrent.thread
import kotlin.random.Random

fun main() {
    println(hilo(4,5))
}
fun hilo(a:Int,b:Int):Int{
    var result=0
    thread {
        Thread.sleep(Random.nextLong(1000,3000))
        result=a+b
    }
    //Thread.sleep(4000)
    return result
}