package dgtic.unam.juego

import kotlin.concurrent.thread
import kotlin.random.Random

fun main() {
    hilolambda(4,7){
        println(it)
    }
}
fun hilolambda(a:Int,b:Int,callback:(result:Int)->Unit){
    var result=0
    thread {
        Thread.sleep(Random.nextLong(1000,3000))
        result=a+b
        callback(result)
    }
    println("Ejecuta más lineas")
}