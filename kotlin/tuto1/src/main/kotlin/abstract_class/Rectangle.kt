package abstract_class

class Rectangle(override var color: String) : Form() {
    override fun draw() {
        println("To draw rectangle")
    }

    override fun toColor() {
        println("To color circle in $color")
    }
}