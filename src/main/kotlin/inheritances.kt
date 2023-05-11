open class wazazi{
    val mama="she likes to argue"
    val baba="does not give a shit"

}
class boy:wazazi(){
    fun mvulana(){
        println(baba)

    }

}
class girl:wazazi(){
    fun msichana(){
        println(mama)
    }

}

fun main(args: Array<String>) {
    val kijanaobj=boy()
    kijanaobj.mvulana()
    val msichanaobj=girl()
    msichanaobj.msichana()
}