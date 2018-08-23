package ch03.ex5_1_1_SplittingStrings


//split() de Java espera uma expressão regular fornecida como String
fun main(args: Array<String>) {
    //Kotlin tem múltiplos split, e um destes espera uma RegEx explícita
    println("12.345-6.A".split("\\.|-".toRegex()))
}
