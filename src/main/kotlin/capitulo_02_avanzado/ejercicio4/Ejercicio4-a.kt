package capitulo_02_avanzado.ejercicio4

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// Diferencia entre los métodos runBlocking{} y coroutineScope{}

val thread = newSingleThreadContext("myThread")
fun main() {
        val tiempoConCoroutineScope = measureTimeMillis {
            testCoroutineScope()
        }
        println("Tiempo coroutineScope ====== $tiempoConCoroutineScope")

        val tiempoConRunBlocking = measureTimeMillis {
            testRunBlocking()
        }
        println("Tiempo runBlocking ======= $tiempoConRunBlocking")
        thread.close()
}
// Funciones para testar
fun testRunBlocking() = runBlocking {

}

fun testCoroutineScope() = runBlocking {

}