package ch02.ex3_2_1_UsingWhenToDealWithEnumClasses

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color) =
//construção similar ao switch case
//retorna um valor, portanto como o corpo desta função só tem a expressão when, é do tipo String
    when (color) {
        Color.RED -> "Richard"//não precisa inserir break
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
}
