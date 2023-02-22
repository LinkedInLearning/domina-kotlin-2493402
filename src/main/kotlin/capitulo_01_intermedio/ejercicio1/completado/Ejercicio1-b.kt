package capitulo_01_intermedio.ejercicio1.completado

// ¿Cómo comprobar el tipo de un objeto en kotlin? ¿Cómo hacer un casteo seguro?

fun main() {
    val miVariable: Any = "Hola"//"Hola, mundo"

    val esString = miVariable is String
    val esInt = miVariable is Int
    println("Mi variable contiene un tipo String = $esString")
    println("Mi variable contiene un tipo Int = $esInt")

    when(miVariable) {
        is String -> { // conversión de tipo segura y automática (smart cast)
            println("Mi variable tiene ${miVariable.length} caracteres")
            miVariable.length
        }
        is Int -> {
            println("Dividimos mi variable  entre 2 = ${miVariable.div(2)}")
            miVariable.div(2)
        }
        is IntArray -> {}
    }
    //operador de conversión "as" y "as?"
    val miString: String? = miVariable as? String
    println("miString = $miString")
}
