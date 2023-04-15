fun main(args: Array<String>) {
    var nom: String = "Diallo"
    var age: Int = 20
    var moyenne: Double = 15.9
    var isAdmis: Boolean = true
    var uneLettre: Char = 'A'
    val taille: Double = 18.9

    println("Nom: $nom")
    val a = 101
    val b = 200

    val max = if (a > b) a else b
    println("Max : $max")

    print("Tapez votre nom: ")
    val name = readLine()
    println("Votre est nom st : $name")

    print("Tapez votre age: ")
    var age2 = readLine()!!.toInt()
    age2 += 2
    println("Votre age st : $age2")

    print("Saisir jour de la semaine: ")
    var nb_jour: Int = readln()!!.toInt()

    /**
     *
     * First method
     */
    when (nb_jour) {
        1 -> println("On est dimanche")
        2 -> println("On est lundi")
        3 -> println("On est mardi")
        4 -> println("On est mercredi")
        5 -> println("On est jeudi")
        6 -> println("On est vendredi")
        7 -> println("On est samedi")

        else -> print("Pas good")
    }

    var day_name = when (nb_jour) {
        1 -> "Lundi"
        2 -> "Mardi"
        3 -> "Mercredi"
        4 -> "Jeudi"
        5 -> "Vendredi"
        6 -> "Samedi"
        7 -> "Dimanche"
        else -> "Pas bon"
    }

    print("Whe are the: $day_name")
}
