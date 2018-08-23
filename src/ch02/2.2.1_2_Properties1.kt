package ch02.ex2_1_3_Properties2

class Person(
    //read-only property (gera um atributo e um getter)
    val name: String,
    //writable property (atributo + getter + setter)
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    //ao invés de chamar o getter, referenciamos a property diretamente
    println(person.name)
    println(person.isMarried)
    //da mesma forma que getters, usamos setters diretamente na property
    person.isMarried = false
    println(person.isMarried)
}
