package ch03.ex3_4_2_NoOverridingForExtensionFunctions1

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

//extension function para View
fun View.showOff() = println("I'm a view!")
//extension function para Button
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    //tipo declarado como View
    val view: View = Button()
    //vai imprimir função de View, não de Button
    view.showOff()
    //extension functions são compiladas como funções estáticas que recebem 
    // o objeto como primeiro elemento
    //View view = new Button();
    //ExtensionsKt.showOff(view);
}
