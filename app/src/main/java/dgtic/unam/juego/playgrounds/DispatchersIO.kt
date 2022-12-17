package dgtic.unam.juego

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    dispatchers()
}

fun dispatchers() {
    runBlocking {
        launch {
            println("Otro subproceso")
        }
        launch(Dispatchers.IO) {
            println("IO")
        }
    }
}