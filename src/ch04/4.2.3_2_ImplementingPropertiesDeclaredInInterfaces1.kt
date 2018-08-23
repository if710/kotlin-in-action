package ch04.ex2_3_2_ImplementingPropertiesDeclaredInInterfaces1

interface User {
    val email: String
    //pode ter getters e setters, desde que não dependam de um backing field
    val nickname: String
        get() = email.substringBefore('@')
}
