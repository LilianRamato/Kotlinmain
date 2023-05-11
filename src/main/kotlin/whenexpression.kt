fun main(args: Array<String>) {
    var mychar='e'
    when(mychar){
        'a'-> println("A is a vowel")
        'e'-> println("E is a vowel")
        'i'-> println("I is a vowel")
        'o'-> println("O is a vowel")
        'u'-> println("U is a vowel")

        else -> println("$mychar is a consonant")
    }
}