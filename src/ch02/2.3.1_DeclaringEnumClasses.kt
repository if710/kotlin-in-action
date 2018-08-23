package ch02.ex3_1_2_DeclaringEnumClasses1


//enums não são listas de valores, podemos declarar propriedades e métodos
enum class Color(
    //propriedades das constantes do enum
    val r: Int, val g: Int, val b: Int
) 
{
    //especifica valores das propriedades ao criar constantes
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    //define um método na classe enum
    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Color.BLUE.rgb())
}
