open class Personne(
    private var name: String, private var lastName: String, private var age: Int = 0
) {

    private var tail: Double = 0.0

    constructor(name: String, lastName: String, age: Int, tail: Double) : this(name, lastName, age) {
        this.tail = tail
    }

    override fun toString(): String {
        return "Personne(name='$name', lastName='$lastName', age=$age, tail=$tail)"
    }

}