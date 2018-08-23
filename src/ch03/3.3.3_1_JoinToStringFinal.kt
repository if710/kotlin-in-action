package ch03.JoinToStringFinal

fun <T> Collection<T>.joinToString(
	    //valores default para parâmetros
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    //named arguments
    println(list.joinToString(separator = "; ",
          prefix = "(", postfix = ")"))
}
