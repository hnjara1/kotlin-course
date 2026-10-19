/*Задачи на приведение коллекции к значению*/
1. val isEmpty = numbers.isEmpty()
println(isEmpty)

2. val isEmpty = numbers.isEmpty()
println(isEmpty)

3. val isNotEmpty = numbers.isNotEmpty()
println(isNotEmpty)

4. val elementOrElse = numbers.getOrElse(10) { -1 }
println(elementOrElse)

5. val numbersString = numbers.joinToString(separator = " : ")
println(numbersString)

6. val sumOfNumbers = numbers.sum()
println(sumOfNumbers)

7. val averageOfNumbers = numbers.average()
println(averageOfNumbers)

8. val maxNumber = numbers.maxOrNull()
println(maxNumber)

9. val minNumber = numbers.minOrNull()
println(minNumber)

10. val firstNumberOrNull = numbers.firstOrNull()
println(firstNumberOrNull)

11.

/*Задачи на обработку коллекций*/

12.  val ages = listOf(15, 22, 30, 18, 35, 27, 12)
val filtered = ages.filter { it in 18..30 }
println(filtered) // [22, 30, 18, 27]

13. val selected = numbers.filterNot { it % 2 == 0 && it % 3 == 0 }
println(selected)

14.

15. val lengths = words.map { it.length }
println(lengths)

16. val reversedMap = words.associate { it to it.reversed() }
println(reversedMap)

17. val sortedWords = words.sorted()
println(sortedWords)

18. val sortedDescending = numbers.sortedDescending()
println(sortedDescending)

19. numbers.map { it * it }.forEach { println(it) }

20.

21. val distinctWords = words.distinct()
println(distinctWords)

22. println(numbers.take(3))

23. println(numbers.takeLast(3))