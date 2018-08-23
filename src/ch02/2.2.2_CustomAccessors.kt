package ch02.ex2_2_CustomAccessors

//Implementação personalizada de um accessor (getter)
class Rectangle(val height: Int, val width: Int) {
    //isSquare não está usando um campo para armazenar o valor, mas sim um custom getter
    // com a implementação fornecida abaixo. O valor é computado ao acessar a propriedade
    val isSquare: Boolean
        get() {
            return height == width
        }
		//Implementação alternativa seria
		//get() =  height == width
		//para chamar de código Java, usamos o método isSquare()
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
    val square = Rectangle(41, 41)
    println(square.isSquare)
}
