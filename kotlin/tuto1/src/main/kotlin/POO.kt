fun main(args: Array<String>) {


    val person1: Personne = Personne(name = "Sow", lastName = "Bassirou", age = 27, tail = 18.0)
    val etudiant = Etudiant("Diallo", "Bassirou", 27, 15.09)

    println("Nom: ${person1.toString()}")
    println("Nom: ${etudiant.toString()}")
}