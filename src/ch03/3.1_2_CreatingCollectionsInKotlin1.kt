package ch03.ex1_2_CreatingCollectionsInKotlin1

fun main(args: Array<String>) {
    val strings = listOf("first", "second", "fourteenth")
    //pegar último elemento da lista
    println(strings.last())
    val numbers = setOf(1, 14, 2)
    //maior elemento do conjunto
    println(numbers.max())
}
