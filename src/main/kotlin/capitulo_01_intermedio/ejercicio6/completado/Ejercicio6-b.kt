package capitulo_01_intermedio.ejercicio6.completado

// Dos bucles for anidados. ¿Cómo salir del bucle externo en una iteración del bucle interno?

fun main() {

    miBucleExterno@ for (i in 1..3) {
        println("Estamos en i = $i ----- for externo")
        for (j in 1..5) {
            println("Estamos en j = $j")
            if (j == 2) {
                break@miBucleExterno
            }
        }
    }
}

