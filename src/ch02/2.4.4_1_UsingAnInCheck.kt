package ch02.ex4_4_1_UsingAnInCheck

//operador in pode ser usado para checar se um valor está em um range
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
//not in faz o contrário
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('x'))
}
