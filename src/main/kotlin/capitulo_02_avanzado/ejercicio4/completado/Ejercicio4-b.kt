package `02avanzado`.ejercicio4.completado

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// Diferencia entre los métodos runBlocking{} y coroutineScope{}

val getThread = newSingleThreadContext("myThread")

fun main() {
    val tiempoConCoroutineScope = measureTimeMillis {
        testCoroutineScope()
    }
    println("Tiempo coroutineScope ====== $tiempoConCoroutineScope")

    val tiempoConRunBlocking = measureTimeMillis {
       testRunBlocking()
    }
    println("Tiempo runBlocking ======= $tiempoConRunBlocking")
    getThread.close()
}

// Funciones para testar
fun testRunBlocking() = runBlocking {
    (1..5).forEach {
        launch(getThread) {
            runBlocking {
                println("Iteración = $it")
                delay(500)
                println("Iteración = $it")
                delay(500)
            }
        }
    }
}

fun testCoroutineScope() = runBlocking {
    (1..5).forEach {
        launch(getThread) {
            coroutineScope {
                println("Iteración = $it")
                delay(500)
                println("Iteración = $it")
                delay(500)
            }
        }
    }
}