package capitulo_01_intermedio.ejercicio2

// Int as Double da error de ClassCastException. ¿Por qué? Diferencias entre casteo y conversión.

fun main() {
    val miInt: Int = 32
    //Usamos el operador "as" para hacer un cast de int a double. -> ClassCastException
    val miDouble: Double = miInt as Double
}

