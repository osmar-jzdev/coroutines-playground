package dgtic.unam.juego

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    job()
}

fun job() {
    runBlocking {
        val job=launch {
            println("inicia 1 ${Thread.currentThread().name}")
            delay(6000)
            println("Ejecución de código 1")
            println("termina 1 ${Thread.currentThread().name}")
        }
        launch {
            while(true){
                delay(1000)
                println("Esta activo: ${job.isActive}")
                println("Es cancelado: ${job.isCancelled}")
                println("Es completado: ${job.isCompleted}")
                //código para cancelar
                if((1..5).shuffled().first()==3){
                    println("Cancelar el job")
                    job.cancel()
                }
            }
        }
    }
}