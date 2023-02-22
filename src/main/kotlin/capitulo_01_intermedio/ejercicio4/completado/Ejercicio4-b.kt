package capitulo_01_intermedio.ejercicio4.completado

// ¿Cómo usar el operador ternario en kotlin?

fun main() {
    //val x = condición ? valor1 : valor2

    val hora = 6

//    val momentoDelDia = hora > 12 ? "Es por la tarde" : "Es por la mañana"
    val momentoDelDia = if (hora > 12) "Es por la tarde" else "Es por la mañana"

    val momentoDelDia2 = if (hora > 12) {
                                println("Estamos en el bloque 1")
                                "Es por la tarde"
                            } else {
                                 println("Estamos en el bloque 2")
                                "Es por la mañana"
                            }
    println(momentoDelDia2)

}
