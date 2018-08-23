package ch03.ex3_5_ExtensionProperties

//definindo uma property, mas não tem estado
//getter sempre tem que ser definido
val String.lastChar: Char
    get() = get(length - 1)

//como em StringBuilders podemos mudar o conteúdo, define set tb
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}

//é desta forma que a API de Java Collections é estendida em Kotlin