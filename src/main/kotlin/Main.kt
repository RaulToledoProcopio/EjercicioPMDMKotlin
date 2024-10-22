package org.example

fun main() { //
    var opcion: Int? = null // Inicialización de la variable que almacenará la opción del menú.

    while (opcion != 0) { // Bucle que se ejecuta mientras la opción no sea 0.

        println("Menú:")
        println("1. Ejercicio 1")
        println("2. Ejercicio 2")
        println("3. Ejercicio 3")
        println("4. Ejercicio 4")
        println("5. Ejercicio 5")
        println("6. Ejercicio 6")
        println("7. Ejercicio 7")
        println("8. Ejercicio 8")
        println("0. Salir")

        print("Elige una opción: ")

        opcion = readLine()?.toIntOrNull() // Lee la entrada del usuario y la convierte a Int.

        // Estructura de control que ejecuta un bloque de código según la opción seleccionada.
        when (opcion) {
            1 -> {
                println("Ejecutando el Ejercicio 1...")
                Ejercicio1()
            }

            2 -> {
                println("Ejecutando el Ejercicio 2...")
                Ejercicio2()
            }

            3 -> {
                println("Ejecutando el Ejercicio 3...")
                Ejercicio3()
            }

            4 -> {
                println("Ejecutando el Ejercicio 4...")
                Ejercicio4()
            }

            5 -> {
                println("Ejecutando el Ejercicio 5...")
                Ejercicio5()
            }

            6 -> {
                println("Ejecutando el Ejercicio 6...")
                Ejercicio6()
            }

            7 -> {
                println("Ejecutando el Ejercicio 7...")
                Ejercicio7()
            }

            8 -> {
                println("Ejecutando el Ejercicio 8...")
                Ejercicio8()
            }

            0 -> println("Saliendo")

            else -> println("Elige una opción válida")
        }
    }
}

fun Ejercicio1() {
    val vida = 100
    val personaje = "Naruto"
    println("El personaje $personaje tiene $vida puntos de vida.")
}

fun Ejercicio2() {
    val energia = 80
    // Determina el estado del personaje según la energía
    val estado = if (energia > 50) "Personaje fuerte" else "Personaje débil"
    println(estado)
}

fun Ejercicio3() {
    val cofres = arrayOf("Espada", "Escudo", "Poción")
    for (cofre in cofres) { // Itera sobre cada cofre
        println("Has encontrado: $cofre") // Muestra el cofre encontrado
    }
}

fun Ejercicio4() {
    for (i in 1..5) {
        if (i == 3) continue  // Salta la iteración cuando i es 3
        println("Número: $i")
    }
}

fun Ejercicio5() {
    class Personaje(var nombre: String, var vida: Int, var ataque: Int) {
        // Metodo para mostrar la información del personaje
        fun mostrarInfo() {
            println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
        }
    }

    // Crea un nuevo personaje
    val goku = Personaje("Goku", 100, 50)
    // Muestra la información del personaje
    goku.mostrarInfo()
}

fun Ejercicio6() {
    val personaje: String? = null
    if (personaje != null) {
        println("El personaje es $personaje")
    } else {
        println("No hay personaje.")
    }
}

fun Ejercicio7() {

    // Función para multiplicar un número por 2
    fun multiplicar(num: Int): Int {
        return num * 2 // Retorna el resultado de la multiplicación
    }
    println(multiplicar(5)) // Llama a la función multiplicar y muestra el resultado
    // Implementación de la operación de suma
    val operacion: Operacion = object : Operacion {
        override fun sumar(a: Int, b: Int) = a + b
    }
    println(operacion.sumar(3, 4)) // Muestra el resultado de la suma
}

fun Ejercicio8() {

    class Personaje(var nombre: String, var vida: Int, var ataque: Int)

    val goku = Personaje("Goku", 100, 20) // Crea el personaje Goku
    val vegeta = Personaje("Vegeta", 80, 25) // Crea el personaje Vegeta

    // Bucle de combate hasta que uno de los personajes se quede sin vida
    while (goku.vida > 0 && vegeta.vida > 0) {
        goku.vida -= vegeta.ataque // Goku recibe daño de Vegeta
        vegeta.vida -= goku.ataque // Vegeta recibe daño de Goku
        // Muestra la vida actual de cada personaje
        println("Vida de Goku: ${goku.vida}")
        println("Vida de Vegeta: ${vegeta.vida}")
    }

    // Determina quién ha ganado el combate
    if (goku.vida <= 0) {
        println("Vegeta ha ganado el combate.") // Gana Vegeta
    } else {
        println("Goku ha ganado el combate.") //Gana Goku
    }
}
