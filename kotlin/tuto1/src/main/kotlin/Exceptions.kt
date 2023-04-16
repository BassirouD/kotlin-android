import exceptions_classes.AgeNotValidException
import java.lang.Exception

fun main() {

    try {
        val result = Diviser(20, 2)
        println("Result : $result")
    } catch (e: ArithmeticException) {
        println(e.message)
    } finally {
        println("Dans tous les cas")
    }

    println("Entrez votre age: ")
    val age = readlnOrNull()?.toInt()
    try {
        checkAge(age!!)
        println("Vous etes tout bon...")
    } catch (e: AgeNotValidException) {
        println(e.message)
    }
}

fun Diviser(a: Int, b: Int): Double {
    if (b == 0) {
        throw ArithmeticException("La division par zero est impossible")
    } else
        return (a / b).toDouble()
}

fun checkAge(age: Int) {
    if (age < 12)
        throw AgeNotValidException("Vous n'est pas autoriser")
}