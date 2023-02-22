package capitulo_01_intermedio.ejercicio3.completado

// Cómo comprobar si todos los caracteres de un string cumplen una condición.

fun main() {
    val miString1 = "MiString es un texto sin números"
    val miString2 = "MiString es un texto con números 12345"
    val resultado1 = miString1.all { it.isLetter() || it.isWhitespace() }
    val resultado2 = miString2.all { it.isLetter() || it.isWhitespace() }

    println(resultado1)
    println(resultado2)
}