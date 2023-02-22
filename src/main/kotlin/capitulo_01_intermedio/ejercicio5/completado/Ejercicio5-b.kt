package capitulo_01_intermedio.ejercicio5.completado

// Convertir una escalera if-else-if a una sentencia when.

enum class EstadoDelCieloB {
    DESPEJADO,
    MEDIO_NUBLADO,
    NUBLADO
}

fun main() {
    val temperatura = 3 // ºC
    val cielo: EstadoDelCieloB = EstadoDelCieloB.NUBLADO

    if (cielo == EstadoDelCieloB.DESPEJADO) {
        println("Sin precipitaciones")
    } else if ( temperatura > 5 && cielo == EstadoDelCieloB.NUBLADO) {
        println("Se esperan lluvias")
    } else if (cielo == EstadoDelCieloB.MEDIO_NUBLADO) {
        println("50% de posibilidades de precipitaciones")
    } else {
        println("Se espera nieve")
    }

    when {
        cielo == EstadoDelCieloB.DESPEJADO -> { println("Sin precipitaciones") }
        temperatura > 5 && cielo == EstadoDelCieloB.NUBLADO -> { println("Se esperan lluvias")}
        cielo == EstadoDelCieloB.MEDIO_NUBLADO -> { println("50% de posibilidades de precipitaciones") }
        else -> { println("Se espera nieve") }
    }

}