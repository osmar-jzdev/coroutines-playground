package dgtic.unam.juego

import kotlin.random.Random

fun main() {
    dispatchersSecuencia()
}

fun dispatchersSecuencia() {
    println("Secuencias")
    crearSecuencias().forEach {
        println("$it datos regresados")
    }
}

fun crearSecuencias():Sequence<Int>{
    return sequence {
        (1..6).forEach {
            println("Emulando el procesamiento de datos")
            Thread.sleep(2000)
            yield(it+ Random.nextInt(20,60))
        }
    }
}