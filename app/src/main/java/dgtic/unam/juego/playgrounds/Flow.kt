package dgtic.unam.juego

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun main() {
    flow()
}

fun crearSecuenciasFlow(): Flow<Int> {
    return flow{
        (1..6).forEach{
            println("procesando flow en crearSecuencias...")
            delay(2000)
            emit(Random.nextInt(10,30))
        }
    }
}

fun flow() {
    runBlocking {
        launch {
            crearSecuenciasFlow().collect{
                println("datos $it")
            }
        }
        launch {
            (1..5).forEach {

            }
        }
    }
}