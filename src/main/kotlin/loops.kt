fun main(args: Array<String>) {
    //This is a for loop

    for (i in 5..12) {
        println("loop = $i")

    }
    val myarray = arrayOf("ab", "be", "cd", "ef", 18)
    for (n in myarray) {
        println(n)

    }
//This ia a while loop
    var num = 10
    var num2 = 0
    while (num >= 0) {
        println("loop:$num")
        num--
    }
    while (num2 <= 20) {
        println(num2)
        num2++
    }
    //This is a do while loop
    var num3 = 100
    do {
        println("loop:$num3")
        num3++
    } while (num3 <= 110)
}









