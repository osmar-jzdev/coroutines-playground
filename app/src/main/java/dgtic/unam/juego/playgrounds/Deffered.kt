package dgtic.unam.juego

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    deffered()
}

fun deffered() {
    runBlocking {
        val deferred=async {
            println("inicia 1 ${Thread.currentThread().name}")
            delay(6000)
            println("Ejecución de código 1")
            println("termina 1 ${Thread.currentThread().name}")
            "regreso una cadena"
        }
        launch {
            while(true){
                delay(1000)
                println("Esta activo: ${deferred.isActive}")
                println("Es cancelado: ${deferred.isCancelled}")
                println("Es completado: ${deferred.isCompleted}")
                //código para cancelar
                if((1..5).shuffled().first()==3){
                    println("Cancelar el deferred")
                    deferred.cancel()
                }
                if((1..5).shuffled().first()==1){
                    println("Esperan el valor: ${deferred.await()}")
                }
            }
        }
    }
}