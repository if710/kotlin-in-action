package ch04.ex1_1_1_InterfacesInKotlin

//interface que tem um único método click
interface Clickable {
    fun click()
}

//implementando a interface
class Button : Clickable {
    //fornecendo implementação de click()
    //usar override é mandatório em Kotlin
    override fun click() = println("I was clicked")
}

fun main(args: Array<String>) {
    Button().click()
}
