package ch02.ex4_3_IteratingOverMaps

import java.util.TreeMap

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    //usando range de caracteres
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    //itera em um mapa, separando chave e valor em diferentes variáveis
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}
