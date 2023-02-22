package capitulo_02_avanzado.ejercicio5.completado


import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//¿Puedo retrasar el inicio de una corrutina?

fun main() = runBlocking {
    println("Antes de launch{}")
    val job = launch(start = CoroutineStart.LAZY) {
        println("Lanzamos corrutina")
        delay(1000)
    }
    job.start()
    println("Después de launch{}")
}

