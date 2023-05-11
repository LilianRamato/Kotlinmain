fun main(args: Array<String>) {
    //This is an object

    val Objc=Marks()

    println(Objc.Hesabu())
}
class Marks{
    //data member
    var num:Int=10
    // member function
    fun Hesabu():Int{
        return num*num
    }
}