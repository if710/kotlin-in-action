package ch03.ex3_4_1_NoOverridingForExtensionFunctions

//declarando uma classe
open class View {
    open fun click() = println("View clicked")
}

//subclasse de View, com override de função
class Button: View() {
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    //comportamento padrão de Java
    val view: View = Button()
    view.click()
}
