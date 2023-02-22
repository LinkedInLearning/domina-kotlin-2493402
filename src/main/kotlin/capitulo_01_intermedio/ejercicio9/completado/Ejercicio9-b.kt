package capitulo_01_intermedio.ejercicio9.completado

//Quiero devolver una función lambda como resultado de otra función.

fun main() {
 val operacion = devolverOperacionArea(PoligonoB.TRIANGULO)
 val operacion2 = devolverOperacionArea(PoligonoB.RECTANGULO)

    println("El área de un triángulo con base 5 y altura 6 es = ${operacion(5.0, 6.0)}")
    println("El área de un rectángulo con lado 5 y lado 6 es = ${operacion2(5.0, 6.0)}")
}

private fun devolverOperacionArea(poligono: PoligonoB) : (Double, Double) -> Double {
    return when(poligono) {
        PoligonoB.TRIANGULO, PoligonoB.ROMBO -> { x, y -> x*y / 2}
        else -> {x, y -> x*y }
    }
}

private enum class PoligonoB {
    TRIANGULO,
    CUADRADO,
    RECTANGULO,
    ROMBO,
    ROMBOIDE
}

/**
 * triángulo -> (base * altura) / 2
 * cuadrado -> lado * lado
 * rectágulo -> lado * lado
 * rombo -> (diagonal_pequeña * diagonal_grande) / 2
 * romboide -> base * altura
 */