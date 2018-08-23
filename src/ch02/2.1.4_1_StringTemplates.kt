package ch02.ex1_4_1_StringTemplates

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    //String templates - permite referenciar variáveis locais em literais
    //Equivalente a "Hello, " + name + "!", tão eficiente quanto - usa StringBuilder no código compilado
    println("Hello, $name!")
}