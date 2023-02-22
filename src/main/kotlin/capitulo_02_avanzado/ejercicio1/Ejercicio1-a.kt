package `02avanzado`.ejercicio1

//¿Cómo acceder a la super clase de la clase externa desde una clase interna inner?

fun main() {

}

private open class CualquierPoligono {
    open fun dibujar() { println("Dibujando un polígono") }
}

private class CuadradoColoreado: CualquierPoligono() {

}