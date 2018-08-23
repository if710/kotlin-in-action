package ch02.ex3_5_SmartCastsCombiningTypeChecksAndCasts

//Codificando expressões aritméticas simples, como (1+2)+4
//A ideia é usarmos uma representação hierárquica (árvore) onde cada nó é uma soma ou um valor numérico
//a interface Expr agrega os tipos Num e Sum e não tem nenhum método associado
interface Expr
//declaramos que Num implementa Expr com o símbolo :
class Num(val value: Int) : Expr
//(1+2)+4 => Sum(Sum(Num(1), Num(2)), Num(4))
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    //se a expressão é um número, retorne o valor do número
    //is é usado como instanceof de Java
    if (e is Num) {
        //este cast explícito é redundante
        val n = e as Num
        return n.value
    }
    //se a expressão é uma soma, avalie lado esquerdo, avalie lado direito e retorne a soma
    if (e is Sum) {
        //smart-cast, não precisa fazer o cast do objeto
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

