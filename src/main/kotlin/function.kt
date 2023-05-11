import kotlin.math.exp
import kotlin.math.sqrt
fun lilian(){
    println("This is a customized user defined function")

}
fun kirianini(){
    val num1=6
    val num2=8
    println("this is a girls school")
    println("the sum of $num1 and $num2 is ${num1+num2}")

}
fun main(args: Array<String>) {
    lilian()
    kirianini()
    him(fname = "Ken", lname = "Ken", darasa = 7)
    mine(fname = "Lillian", age =  18)
}
fun him(fname:String,lname:String,darasa:Int){
    println("He is $fname $lname and is in class $darasa")

}
fun mine(fname:String,age:Int){
    println("My first name is $fname and am $age year old")
}

