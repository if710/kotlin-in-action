package ch02.ex1_2_Functions

//tipo de retorno da função vem após o nome e lista de parâmetros
fun max1(a: Int, b: Int): Int {
    //diferente de outras linguagens, o if é uma expressão, que resulta em um valor
    // similar ao operador ternário (a > b) ? a : b
    return if (a > b) a else b
}

//o corpo da função é apenas uma expressão, podemos simplificar a declaração
fun max2(a: Int, b:Int) : Int = if (a>b) a else b

//Devido ao mecanismo de inferência de tipos, podemos omitir o tipo de retorno
fun max3(a: Int, b:Int) = if (a>b) a else b
//isso só funciona para funções cujo corpo consiste em uma expressão
//no caso de blocos, precisamos especificar o tipo de retorno e o statement return

fun main(args: Array<String>) {
    println(max1(1, 2))
    println(max2(1, 2))
    println(max3(1, 2))

    //declarando variáveis
    val question = "The Ultimate Question of Life, the Universe, and Everything"
    val answer = 42
    //tipo foi omitido, mas pode ser explicitamente especificado
    val answer2 : Int = 42
    //declarar uma variável com val sinaliza que é uma referência imutável
    //
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
    //não há problema, pois a referência permanece inalterada, 
    // o que mudou é o conteúdo do objeto para onde se está apontando
    
    //var permite alterar referências, mas o tipo permanece fixo
    var answer3 = 42
    //answer3 = "no answer" //erro de compilação - type mismatch
    
}


