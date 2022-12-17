package dgtic.unam.juego

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            println("Otro subproceso")
        }
        launch(Dispatchers.Default) {
            println("default")
        }
    }
}
