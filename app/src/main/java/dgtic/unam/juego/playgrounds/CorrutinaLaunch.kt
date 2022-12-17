package dgtic.unam.juego

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    launch {
        crearSecuenciasFlow().collect {
            println("datos $it")
        }
    }
}

fun launch(param: () -> No) {
    runBlocking {
        launch {
            println("inicia ${Thread.currentThread().name}")
            delay(1000)
            println("Ejecución de código 1")
            println("termina ${Thread.currentThread().name}")
        }
        launch {
            println("inicia ${Thread.currentThread().name}")
            delay(3000)
            println("Ejecución de código 2")
            println("termina ${Thread.currentThread().name}")
        }
        println("inicia ${Thread.currentThread().name}")
        delay(2000)
        println("Ejecución de código 3")
        println("termina ${Thread.currentThread().name}")
    }
}