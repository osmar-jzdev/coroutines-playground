package dgtic.unam.juego

import kotlinx.coroutines.*

fun main() {

    dispatchersWithContextFirstExample()

    //another example
    //dispatchersWithContextFirstExample2()
}

fun dispatchersWithContextFirstExample() {
    runBlocking {
        println("nombre corrutina ${Thread.currentThread().name}")
        withContext(newSingleThreadContext("personalizado con with context")) {
            println("WithContext")
            delay(2000)
            println("nombre corrutina: ${Thread.currentThread().name}")
            println("termina corrutina: ${Thread.currentThread().name}")
        }
        println("termina corrutina: ${Thread.currentThread().name}")
    }
}

fun dispatchersWithContextFirstExample2() {
    runBlocking {
        println("nombre corrutina ${Thread.currentThread().name}")
        withContext(newSingleThreadContext("personalizado con with context")) {
            println("WithContext")
            delay(2000)
            println("nombre corrutina: ${Thread.currentThread().name}")
            println("termina corrutina: ${Thread.currentThread().name}")
        }
        withContext(Dispatchers.Default) {
            println("WithContext")
            delay(1000)
            println("Uso del CPU: ${Thread.currentThread().name}")
            println("termina corrutina: ${Thread.currentThread().name}")
        }
        println("termina corrutina: ${Thread.currentThread().name}")
    }
}