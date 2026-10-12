package lessons.lesson10.homeworks
/* Задачи на работу со словарём*/

/*1*/ val EmptyNotMutable: Map<Int, Int> = emptyMap()

/*2*/ val Map: Map<Float, Double> = mapOf()

/*3*/  val map1: MutableMap<Int, String> = mutableMapOf(
      1 to "uno",
      2 to "dos",
      3 to "tres"
  )
/*4*/  map1[4] = "quatro"
/*5*/
/*6*/ map1.remove(2)
/*7*/
/*8*/   val map1 = mutableMapOf(1 to "uno")

        map1[99] = "новое"
        map1.replace(100, "новое")

 /*9*/
/*10*/
    val dict: MutableMap<String, MutableList<Int>> = mutableMapOf()
     dict["четные"] = mutableListOf(2, 4, 6)
     dict["нечетные"] = mutableListOf(1, 3, 5)

/*Задачи на подбор оптимального типа для словаря*/

/*библиотека,справочник растений, финал*/
MutableMap<String, MutableList<String>
Map<String, List<String>>

/*курс лечения*/
MutableMap<LocalDate, MutableList<String>
Map<LocalDate, List<String>>

/*словарь путешественника*/
MutableMap<String, MutableMap<String, MutableList<String>
Map<String, Map<String, List<String>






