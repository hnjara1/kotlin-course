package lessons.lesson16.homeworks

/*Животные и их звуки*/
object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}

// базовый класс
open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

// переопределение в наследниках
class Dog : Animal() {
    override fun makeSound() {
        printColored("Bark", Colors.RED)
    }
}

class Cat : Animal() {
    override fun makeSound() {
        printColored("Meow", Colors.GREEN)
    }
}

class Bird : Animal() {
    override fun makeSound() {
        printColored("Tweet", Colors.CYAN)
    }
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())

    for (animal in animals) {
        animal.makeSound()
    }
}



/*Геометрические фигуры*/

import kotlin.math.PI
import kotlin.math.sin

// абстрактный базовый класс с open методом
abstract class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

// площадь треугольника по двум сторонам и углу между ними
class Triangle(val sideA: Double, val sideB: Double, val angleDegrees: Double) : Shape() {
    override fun area(): Double {
        val angleRadians = angleDegrees * PI / 180.0
        return 0.5 * sideA * sideB * sin(angleRadians)
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 6.0, 45.0)
    )

    for (shape in shapes) {
        println("Площадь фигуры: ${shape.area()}")
    }
}

/*Принтеры*/

// абстрактный принтер с абстрактным методом печати
abstract class Printer {
    abstract fun print(text: String)
}

// лазерный

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            printColored(word, Colors.BLACK, Background.WHITE)
        }
    }
}

// струйный
class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        Pair(Colors.RED, Background.YELLOW),
        Pair(Colors.BLUE, Background.WHITE),
        Pair(Colors.GREEN, Background.BLACK),
        Pair(Colors.PURPLE, Background.CYAN),
        Pair(Colors.CYAN, Background.RED)
    )

    override fun print(text: String) {
        val words = text.split(" ")
        var index = 0
        for (word in words) {
            val pair = colorPairs[index % colorPairs.size]
            printColored(word, pair.first, pair.second)
            index++
        }
    }
}

fun main() {
    val longText = "Kotlin is a modern programming language that makes developers happier " +
            "and more productive it is concise safe interoperable and fun to write"

    val printers: List<Printer> = listOf(LaserPrinter(), InkjetPrinter())

    for (printer in printers) {
        printer.print(longText)
        println("---")
    }
}

