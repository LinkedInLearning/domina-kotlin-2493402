package `02avanzado`.ejercicio1.completado

//¿Cómo acceder a la super clase de la clase externa desde una clase interna inner?

fun main() {
    CuadradoColoreadoB().dibujar()
}

private open class CualquierPoligonoB {
    open fun dibujar() { println("Dibujando un polígono (super clase)") }
}

private class CuadradoColoreadoB: CualquierPoligonoB() {
    override fun dibujar() {
        //Dibujar y colorear el cuadrado
        Pintor().colorearYDibujar()
    }

    inner class Pintor() {
        fun colorear() {
            println("Colorendo...")
        }
        fun colorearYDibujar() {
            super@CuadradoColoreadoB.dibujar()
            colorear()
        }
    }
}