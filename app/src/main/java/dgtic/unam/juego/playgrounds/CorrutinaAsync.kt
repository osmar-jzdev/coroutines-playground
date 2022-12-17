package dgtic.unam.juego

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    async()
}

fun async() {
    runBlocking {
        val result=async {
            println("inicia 1 ${Thread.currentThread().name}")
            delay(3000)
            println("Ejecución de código 1")
            println("termina 1 ${Thread.currentThread().name}")
            "regreso una cadena"
        }
        println("Esperando el resultado")
        println("Resultado:= ${result.await()}")
        println("inicia 2 ${Thread.currentThread().name}")
        delay(2000)
        println("Ejecución de código 2")
        println("termina 2 ${Thread.currentThread().name}")
    }
}