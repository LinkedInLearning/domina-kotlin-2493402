package capitulo_01_intermedio.ejercicio7.completado

// Añadir un parámetro opcional en mi función

fun main() {
    calculoSueldoMensual( 12,  40000)
    calculoSueldoMensual( 12,  40000, "Ana")
}

fun calculoSueldoMensual(nPagas: Int = 12, sueldoAnualTotal: Int, nombreEmpleado: String = "Anónimo") {
    //cálculo del sueldo mensual
    println("El sueldo mensual de $nombreEmpleado es: X")
}