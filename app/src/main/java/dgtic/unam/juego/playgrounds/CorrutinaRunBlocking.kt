package dgtic.unam.juego

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    bloque()
}

fun bloque() {
    runBlocking {
        println("inicia ${Thread.currentThread().name}")
        delay(2000)
        println("Ejecución de código")
        println("termina ${Thread.currentThread().name}")
    }
}