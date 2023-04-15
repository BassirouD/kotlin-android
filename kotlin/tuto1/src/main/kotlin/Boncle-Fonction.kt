fun main(args: Array<String>) {
    var compteur = 1
    var compteur2 = 10
    var somme = 0

    /**
     *
     * While
     *
     */
    while (compteur <= 5) {
        println("Enum: $compteur")
        compteur++
    }

    while (compteur2 != 0) {
        somme += compteur2
        compteur2--
    }

    println("Somme: $somme")

    /**
     * Do While
     */

    var comp3 = 0
    do {
        println("It $comp3")
        comp3++
    } while (comp3 <= 5)


    /**
     * For incremente avec step 3(On peut enlever le step)
     */
    for (compfor in 0..30 step 3) {
        println("Compteur for: $compfor")
    }

    /**
     * For decremente avec step 2(On peut enlever le step)
     */
    for (comptfor in 5 downTo 1 step 2)
        println("Down to: $comptfor")

    /**
     * Avec tableau
     */

    var programme_language = arrayOf("Java", "Kotlin", "Python", "C++")

    for (comp in 0..programme_language.lastIndex)
        println("Languages ${programme_language[comp]}")

    /**
     * Items
     */
    for (language in programme_language)
        println("Languages $language")

    /**
     * Index
     */
    for (indice in programme_language.indices)
        println("Indice $indice")

    /**
     * Item et index
     */
    for ((indice, language) in programme_language.withIndex())
        println("Indice $indice, Language: $language")

    /**
     * Les fonctions
     */

    somme = calceSomme(20, 30)
    println(somme)

    println("Saisir votre nom")
    var name = readLine()!!
    println("Saisir votre prenom")
    var lastName = readLine()!!
    println("Saisir votre age")
    var age = readLine()!!.toInt()
    displayInfos(name = name, lastName = lastName, age = age)

}


fun calculSomme(num1: Int, num2: Int): Int {
    val somme = num1 + num2
    return somme
}

/**
 * Type 2 function
 */

fun calceSomme(val1: Int, val2: Int) = val1 + val2

fun displayInfos(name: String, lastName: String, age: Int = 10) {
    println("Name: $name, LastName: $lastName, Age: $age")
}



