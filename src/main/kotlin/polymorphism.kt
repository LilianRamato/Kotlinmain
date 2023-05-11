//parent class or super class
open class Shape{
    open fun draw(){
        println("Drawing shape")
    }

}
//child class
class Circle:Shape(){
    override fun draw() {
        super.draw()
        println("Drawing a circle")
    }
}
class Square:Shape(){
    override fun draw() {
        super.draw()
        println("Drawing a square")
    }
}
class Triange:Shape(){
    override fun draw() {
        super.draw()
        println("Drawing a triangle")
    }

}

fun main(args: Array<String>) {
    val shape:Array<Shape> = arrayOf(Circle(),Square(),Triange())
    for(shape in shape){
        shape.draw()
    }
}