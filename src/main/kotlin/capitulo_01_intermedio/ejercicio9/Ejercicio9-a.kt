package capitulo_01_intermedio.ejercicio9

//Quiero devolver una función lambda como resultado de otra función.

fun main() {

}

private enum class Poligono {
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