package ch02.ex3_4_UsingWhenWithoutAnArgument

import ch02.colors.Color
import ch02.colors.Color.*

//otimiza a função, pois evita criar instâncias de Set
fun mixOptimized(c1: Color, c2: Color) =
	//podemos usar when sem argumentos
	//neste caso a condição deve ser uma expressão booleana
    when {
        (c1 == RED && c2 == YELLOW) ||
        (c1 == YELLOW && c2 == RED) ->
            ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
        (c1 == BLUE && c2 == YELLOW) ->
            GREEN

        (c1 == BLUE && c2 == VIOLET) ||
        (c1 == VIOLET && c2 == BLUE) ->
            INDIGO

        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println(mixOptimized(BLUE, YELLOW))
}
