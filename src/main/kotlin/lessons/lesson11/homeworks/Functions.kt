package lessons.lesson11.homeworks
/*Задачи на сигнатуру метода*/

1. fun doSomething() {
}

2. fun sum(a: Int, b: Int): Int {
    return a + b
}

3. fun printText(text: String) {
}

4. fun average(numbers: List<Int>): Double {
    return 0.0
}

5. private fun getLength(text: String?): Int? {
    return text?.length
}

6. fun getNumber(): Double? {
    return null
}

7. private fun processList(numbers: List<Int>?) {
}

8. fun toText(number: Int): String? {
    return null
}



9. fun getStrings(): List<String?> {
    return emptyList()
}

10. fun check(text: String?, number: Int?): Boolean? {
    return null
}

/*Задачи на написание кода*/

1. fun multiplyByTwo(number: Int): Int {
    return number * 2
}

2. fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

3. fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (number in 1..n) {
        println(number)
    }
}

4.