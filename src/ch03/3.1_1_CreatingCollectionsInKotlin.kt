package ch03.ex1_1_CreatingCollectionsInKotlin

//criando conjuntos, listas, e mapas/hashtables
val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
//to não é palavra reservada, é uma função

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    //usa a API de Collections de Java - facilita interagir com código Java
    //no contexto de Kotlin, é uma versão turbinada de Collections
}
