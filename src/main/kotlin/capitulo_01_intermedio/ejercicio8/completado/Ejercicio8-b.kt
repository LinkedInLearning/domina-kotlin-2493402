package capitulo_01_intermedio.ejercicio8.completado

// Cómo pasar una función cómo parámetro a otra función.

fun main() {

    val multiplicar: (Int, Int) -> Int = { x,y -> x*y}
    mostrarResultado(3,2, multiplicar)
    mostrarResultado(3,2) { it, it2 -> it + it2 }

}

private fun mostrarResultado(operando1: Int, operando2: Int, operacion: (Int, Int) -> Int) {
    val resultado = operacion(operando1, operando2)
    println("El resultado es: $resultado")
}