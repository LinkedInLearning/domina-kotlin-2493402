package `02avanzado`.ejercicio2.completado

// Como resolver conflictos en caso de que dos interfaces tengan métodos con los mismos nombres.

fun main() {

    //val objetoC = C().funcion1()
    val objetoD = D().funcion1()
}

private interface A {
    fun funcion1(){ println("Interfaz avanzado.ejercicio2.terminado.A") }
}

private interface B {
    fun funcion1() { println("Interfaz avanzado.ejercicio2.B") }
}

private class C: A {
    override fun funcion1() {
        super.funcion1()
        println("Estamos en la clase avanzado.ejercicio2.C")
    }
}

private class D : A, B {
    override fun funcion1() {
        super<A>.funcion1()
        super<B>.funcion1()
    }
}