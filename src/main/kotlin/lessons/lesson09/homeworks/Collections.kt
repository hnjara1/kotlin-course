package lessons.lesson09.homeworks/* Работа с массивами Array*/

val example1  = arrayOf(1, 2, 3, 4, 5)

val example2  = Array(10) { "" }
val emptyNullableArray = arrayOfNulls<Int>(10)

val example3 = DoubleArray(5) { it * 2.0 }

val example4 = IntArray(5)
var i = 0
while (i < example4.size) {
    example4[i] = i * 3
    i++
}

val example5 = arrayOf<String?>("Первая", null, "Третья")

/* шестого нет*/

val array1 = arrayOf(100, 200, 300, 400, 500)
val array2 = arrayOf(10, 20, 30, 40, 50)
val result = Array(array1.size) { array1[it] - array2[it] }
println(result.joinToString())

/*Работа со списками List*/

val emptyList: List<Int> = emptyList()

val strings: List<String> = listOf("Hello", "World", "Kotlin")

val mutableNumbers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
mutableNumbers.add(6)
mutableNumbers.add(7)
mutableNumbers.add(8)

val spisok= mutableListOf("Hello", "World", "Kotlin")
spisok.remove("World")

val spisok2 = listOf(1, 2, 3, 4, 5)
for (element in spisok2) {
    println(element)
}

val words = listOf("Hello", "World", "Kotlin")
val second = words[1]

/*Работа с Множествами Set*/

val emptySet: Set<Int> = emptySet()

val example11: Set<Int> = setOf(1, 2, 3)

val example1122 = mutableSetOf("Kotlin", "Java", "Scala")
example1122.add("Swift")
example1122.add("Go")

val example33 = mutableSetOf(1, 2, 3, 4, 5)
example33.remove(2)




