package `02avanzado`.ejercicio2

// Como resolver conflictos en caso de que dos interfaces tengan métodos con los mismos nombres.

fun main() {

}

private interface A {
    fun funcion1() { println("Interfaz A") }
}

private interface B {
    fun funcion1() { println("Interfaz B") }
}
