package ch02.ex1_4_3_StringTemplates2

fun main(args: Array<String>) {
    //é possível até mesmo aninhar aspas duplas dentro de aspas duplas, 
    // desde que estejam dentro de uma expressão
    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
}
