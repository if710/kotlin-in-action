package ch03.ex4_2_VarargsFunctionsThatAcceptAnArbitraryNumberOfArguments

//aceita número arbitrário de argumentos
fun main(args: Array<String>) {
    //neste caso estamos chamando uma função que espera receber um array, 
    // por isso usamos o spread operator, isso permite combinar os valores
    // Em Java só poderia receber args direto
    val list = listOf("args: ", *args)
    println(list)
}
