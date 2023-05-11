class Sturborn{
   private var nambari=5

    fun calculate():Int{

        return nambari*nambari

    }
}

fun main(args: Array<String>) {
    //This is an object
    val myobje=Sturborn()
    val Objc=Emobilis()
    println(myobje.calculate())
    println(Objc.Hesabu())
}
 class Emobilis{
     //data member
     var num:Int=6
     // member function
     fun Hesabu():Int{
         return num*num
     }
 }




