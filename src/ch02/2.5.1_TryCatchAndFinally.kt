package ch02.ex5_1_TryCatchAndFinally

import java.io.BufferedReader
import java.io.StringReader

//não precisa declarar explicitamente exceções que podem ser lançadas
//Kotlin não diferencia checked de unchecked exceptions
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    //tipo da exceção fica à direita
    catch (e: NumberFormatException) {
        return null
    }
    //funciona da mesma forma que em Java
    finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}
