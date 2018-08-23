package ch02.ex4_2_2_RangesProgressions1

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
	//conta de 100 até 1 apenas considerando números pares
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
}
