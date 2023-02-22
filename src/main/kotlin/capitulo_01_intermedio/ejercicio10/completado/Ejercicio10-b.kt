package capitulo_01_intermedio.ejercicio10.completado


//  Cómo usar una función lambda cómo callback, que te avise de que una tarea haya acabado.

fun main() {

    println("Empezamos a cocinar")
    val result = cocinarHamburguesa("Pollo", listOf("lechuga", "tomate")) {
        println("Hamburguesa terminada: $it")
    }
    println("result = $result")

    println("----Seguimos preparando bebidas")
    println("----Limpiando la barra")
}

private data class HamburguesaB(val carne: String, val otrosIngredientes: List<String>)


private fun cocinarHamburguesa(tipoCarne: String, ingredientes: List<String>, hamburguesaTerminada: (HamburguesaB) -> Unit) : HamburguesaB {
    repeat(10) {
        Thread.sleep(100)
        println("Cocinando = ${it * 10} %")
    }
    /**
     * Un ejemplo más real sería con un servicioCocina ->
     * ServicioCocina{
     *  onSuccess{}
     *  onFailure{}
     * }
     */
    val resultado = HamburguesaB(tipoCarne, ingredientes)
    hamburguesaTerminada(resultado)
    return resultado
}