package dgtic.unam.juego

import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            println("Otro subproceso")
        }
        launch(newSingleThreadContext("Personalizada")) {
            println("mi corrutina ${Thread.currentThread().name}")
        }
        newSingleThreadContext("segunda personalizada").use { contexto->
            launch(contexto) {
                println("corrutina ${Thread.currentThread().name}")
            }
        }
    }
}