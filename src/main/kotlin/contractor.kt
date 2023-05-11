class  Students(val name:String,var gender:String,var age:Int){
// if the variable can change use val and if it does not change use var
}

fun main( args:Array<String>) {
    //this is an object
    val myobj=Students("Erick","Male",50)
    val Objc=Students("Melita","Female",12)
    val myobje=Students("James","Male",32)
    val Myobj=Students("Leken","Male",28)
    val myoBj=Students("Macharia","Male",18)
    val myObj=Students("Lenny","Male",20)

// class is a blueprint of an object
//object is an instance of a class
    println("Students name is a ${myobj.name} and he is ${myobj.gender} of ${myobj.age} years old")
    println("Students name is a ${Objc.name} and he is ${Objc.gender} of ${Objc.age} years old")
    println("Students name is a ${myobje.name} and he is ${myobje.gender} of ${myobje.age} years old")
    println("Students name is a ${Myobj.name} and he is ${Myobj.gender} of ${Myobj.age} years old")
    println("Students name is a ${myoBj.name} and he is ${myoBj.gender} of ${myoBj.age} years old")
    println("Students name is a ${myObj.name} and he is ${myObj.gender} of ${myObj.age} years old")



}