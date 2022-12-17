package dgtic.unam.juego

fun main() {
    //version uno
    funcionlambda(3,4,{regresa ->
        println(regresa)
    })
    //version dos
    funcionlambda(3,4){regresa ->
        println(regresa)
    }
}
fun funcionlambda(a:Int,b:Int,callback:(result:Int)->Unit) {
    callback(a+b)
}