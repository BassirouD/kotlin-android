package abstract_class

class Circle() : Form() {
    override var color: String="Red"
    override fun draw() {
        println("To draw circle")
    }

    override fun toColor() {
        println("To color circle in $color")
    }
}