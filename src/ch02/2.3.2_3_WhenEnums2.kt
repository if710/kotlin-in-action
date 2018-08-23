package ch02.ex3_2_3_UsingWhenToDealWithEnumClasses2

import ch02.colors.Color
import ch02.colors.Color.*

//podemos importar os valores das constantes, para não precisar usar Color.RED
fun getWarmth(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(Color.ORANGE))
}
