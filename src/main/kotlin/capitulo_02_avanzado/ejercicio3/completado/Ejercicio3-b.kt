package capitulo_02_avanzado.ejercicio3.completado

//Usar métodos kotlin desde Java con parámetros opcionales.

fun main() {
    val jugador1 = Jugador("Carla", 34, 4)
    val jugador2 = Jugador("Carla", 34)
}

data class Jugador @JvmOverloads constructor(val nombre: String,val edad: Int,val puntos: Int = 0)