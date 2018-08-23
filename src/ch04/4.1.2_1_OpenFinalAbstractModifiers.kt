package ch04.ex1_2_1_OpenFinalAndAbstractModifiersFinalByDefault

//classes e métodos em Kotlin são final por default
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}
// se deseja permitir que a classe seja estendida, tem que usar open
// da mesma forma, se deseja permitir que um método seja sobrescrito...
open class RichButton : Clickable {

    fun disable() {}

    open fun animate() {}

    override fun click() {}
}
