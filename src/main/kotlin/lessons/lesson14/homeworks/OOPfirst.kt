package lessons.lesson14.homeworks
/*Задание1*/
class Party(val location: String, val attendees: Int) {
   fun details() {
       println("The party is at $location with $attendees attendees.")
   }
}
fun main() {
   val party = Party("Beach House", 20)
   party.details()
}

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        println("Feeling $type with intensity level $intensity.")
    }
}

/*Задание2*/

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        println("Feeling $type with intensity level $intensity.")
    }
}
fun main() {
    val emotion = Emotion("happiness", 8)
    emotion.express()
}

/*Задание3*/

object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"
    fun showPhase() {
        if (isVisible) {
            println("The moon is visible, and it's currently a $phase.")
        } else {
            println("The moon is not visible right now.")
        }
    }
}
fun main() {
    Moon.showPhase()  // The moon is visible, and it's currently a Full Moon.
}


/*Задание4*/

data class Product(val name: String, val price: Double, val quantity: Int)
fun main() {
    val apple = Product("Apple", 0.5, 10)
    println(apple)
}

/*Задание5*/

class Concert(val band: String, val location: String, val cost: Int, val capacity: Int) {

    private var ticketSold = 0

    fun buyTicket() {
        if (ticketSold < capacity) {
            ticketSold++
        }
    }

    fun printDetails() {
        println("Концерт группы $band в $location. Стоимость билета $cost. Осталось ${capacity - ticketSold} мест")
    }
}
fun main() {
    val concert = Concert("The Beatles", "Madison Square Garden", 5000, 1000)
    concert.printDetails()
    concert.buyTicket()
    concert.printDetails()
}


/*Задание6*/

class Shelf(val capacity: Int) {

    private val items = mutableListOf<String>()

    fun addItem(name: String): Boolean {
        if (!canAccommodate(name)) {
            return false
        }
        items.add(name)
        return true
    }

    fun removeItem(name: String): Boolean {
        if (!items.contains(name)) {
            return false
        }
        items.remove(name)
        return true
    }

    fun canAccommodate(name: String): Boolean {
        val currentAccommodation = items.map {
            it.length
        }.sum()
        return currentAccommodation + name.length <= capacity
    }

    fun containsItem(name: String) = items.contains(name)

    fun getItems() = items.toList()
}
class Rack(private val maxShelves: Int) {

    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.contains(shelf) || shelves.size == maxShelves) {
            return false
        }
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val items = shelves[index].getItems()
        shelves.removeAt(index)
        return items
    }

    fun addItem(name: String): Boolean {
        if (shelves.isEmpty()) {
            return false
        }
        for (shelf in shelves) {
            if (shelf.canAccommodate(name)) {
                return shelf.addItem(name)
            }
        }
        return false
    }

    fun removeItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.containsItem(name)) {
                return shelf.removeItem(name)
            }
        }
        return false
    }

    fun containsItem(name: String): Boolean {
        return shelves.any { it.containsItem(name) }
    }

    fun getShelves() = shelves.toList()

    fun printContents() {
        for (i in shelves.indices) {
            val capacity = shelves[i].capacity
            val accessiblePlace = capacity - shelves[i].getItems()
                .map { it.length }
                .sum()
            val meta = "$i вместимость: $capacity доступно: $accessiblePlace"
            val items = shelves[i].getItems().joinToString()
            println(meta)
            println("Предметы: $items")
            println()
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val notReplacedItems = mutableListOf<String>()
        val otherShelves = shelves - shelves[index]
        for (item in shelves[index].getItems()) {
            if (otherShelves.none { it.addItem(item) }) {
                notReplacedItems.add(item)
            }
        }
        shelves.removeAt(index)
        return notReplacedItems.toList()
    }
}
/*