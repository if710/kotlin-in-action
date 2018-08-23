package ch04.ex1_5_2_SealedClassesDefiningRestrictedClassHierarchies1

//não permite criação de subclasses
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        //só tem que se preocupar com estes dois casos
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }
