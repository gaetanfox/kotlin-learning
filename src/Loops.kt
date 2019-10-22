fun main() {
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "landSpeeder", "Boba Fett" to "Rocket pack")

    for (rebel in rebels) {
        println("name: $rebel")
    }
    for ((key, value) in rebelVehicles) {
        println("$key is driving a $value")
    }
    var x = 10
    while (x > 0) {
        println(x)
        x--
    }
}