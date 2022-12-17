package dgtic.unam.juego

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    coroutines()
}

fun coroutines() {
    runBlocking {
        (1..1000000).forEach {
            launch {
                delay(1000)
                print("0")
            }
        }
    }
}