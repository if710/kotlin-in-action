package ch02.ex1_4_2_StringTemplates1

fun main(args: Array<String>) {
    if (args.size > 0) {
        //é possível usar expressões mais complexas, basta colocar {}
        println("Hello, ${args[0]}!")
        //pega o primeiro elemento do array
    }
}
