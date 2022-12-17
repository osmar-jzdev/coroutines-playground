package dgtic.unam.juego

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        while(true){
            println("Código de la coroutina ${Thread.currentThread().name} ejecutando")
        }
    }
    Thread.sleep(2000)
}