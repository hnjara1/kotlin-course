package lessons.lesson07.homeworks

import i

/*Прямой диапазон*/

for (i in 1..5) {
    println(i)
}


for (i in 2..10 step 2) {
    println(i)
}

/*Обратный диапазон*/

for (i in 5 downTo 1) {
    println(i)
}

for (i in 10 downTo 1 step 2) {
    println(i)
}

/*С шагом (step)*/

for (i in 1..9 step 2) {
    println(i)
}

for (i in 1..20 step 3) {
    println(i)
}

/*Использование до (until)*/

val size = 6
for (i in 3 until size step 2) {
    println(i)
}

/*Цикл while*/

var i = 1

while (i <= 5) {
    println(i * i)
    i++
}

var i = 10

while (i >= 5) {
    println(i)
    i--
}

/*Цикл do while*/

var i = 5
do {
    println(i)
    i--
} while (i >= 1)


var counter = 5
do {
    println(counter)
    counter++
} while (counter < 10)


/*Использование break*/

for (i in 1..10) {
    if (i == 6) { break
    }
    println(i)
}


/*Использование continue*/

for (i in 1..10) {
    if (i % 2 == 0) {
        continue
    }
    println(i)
}


