package ch04.main

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")
    
    //herda múltiplas implementações default
    //tem que fazer override
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}


interface Clickable {
    fun click()
    //default implementation
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    //default implementation
    fun showOff() = println("I'm focusable!")
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}
