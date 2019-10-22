fun main() {
    val a = 2
    val b = 3

    if (a == b) println("WAZAAA")
    if (a != b) println("WAZAAA OUPS")

    val accountBalance = 100
    val price = 150

    if (accountBalance >= price) {
        println("I can buy that")
    } else {
        println("U BROKE BRUH!")
    }

    val degrees = 60
    if (degrees >= 70) {
        println("the weather is nice")
    } else if (degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Way too cold bruh")
    }

    val isHungry = false
    val isBored = true
    if (isHungry || isBored) {
        println("Let's get pizza")
    }

    val x = 3
    when (x) {
        1 -> println("x is equal to one")
        2 -> println("x is equal to two")
        else -> println("x is equal to something else")
    }

    fun vaderIsFeeling(mood: String = "angry"){
        if (mood == "angry") {
            println("run for the hills, vader is $mood")
        } else {
            println("whatever you do, don't make him angry")
        }
    }

    vaderIsFeeling("happy")
}