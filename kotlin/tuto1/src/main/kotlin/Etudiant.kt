class Etudiant(var name: String, var lastName: String, var age: Int) : Personne(
    name, lastName, age
) {

    var moyenne: Double = 0.0

    constructor(name: String, lastName: String, age: Int, moyenne: Double) : this(name, lastName, age) {
        this.name = name
        this.lastName = lastName
        this.age = age
        this.moyenne = moyenne
    }

    override fun toString(): String {
        return "Etudiant(name='$name', lastName='$lastName', age=$age, moyenne=$moyenne)"
    }


}