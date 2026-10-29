/*Геометрические фигуры*/

abstract class GeometricFigure(val name: String) {
    open fun describe() {
        println("Фигура: $name")
    }
}

open class Polygon(
    name: String,
    val sideCount: Int
) : GeometricFigure(name)

class Triangle(
    name: String,
    val triangleType: String
) : Polygon(name, 3)

class Quadrilateral(
    name: String,
    val quadrilateralType: String
) : Polygon(name, 4)

class Circle(
    name: String,
    val radius: Double
) : GeometricFigure(name)


/*Учебные заведения*/

abstract class EducationalInstitution(
    val name: String,
    val city: String
) {
    open fun showInfo() {
        println("$name, город $city")
    }
}

open class School(
    name: String,
    city: String,
    val studentCount: Int
) : EducationalInstitution(name, city)

class PrimarySchool(
    name: String,
    city: String,
    studentCount: Int,
    val gradesRange: String
) : School(name, city, studentCount)

class HighSchool(
    name: String,
    city: String,
    studentCount: Int,
    val profile: String
) : School(name, city, studentCount)

class University(
    name: String,
    city: String,
    val facultyCount: Int
) : EducationalInstitution(name, city)

/*Иерархия мебели*/

abstract class Furniture(
    val material: String,
    val price: Int
) {
    open fun showInfo() {
        println("Мебель из $material, цена $price")
    }
}

open class SeatingFurniture(
    material: String,
    price: Int,
    val seatCount: Int
) : Furniture(material, price)

class Chair(
    material: String,
    price: Int,
    val hasBackrest: Boolean
) : SeatingFurniture(material, price, 1)

class Sofa(
    material: String,
    price: Int,
    seatCount: Int,
    val isCorner: Boolean
) : SeatingFurniture(material, price, seatCount)

class Table(
    material: String,
    price: Int,
    val shape: String
) : Furniture(material, price)


