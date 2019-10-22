fun main() {
    fun forceChoke() {
        println("You have failed me for the last time Admiral...")
    }
    forceChoke()

    fun makeAnEntrance(line: String){
        println(line)
    }
    makeAnEntrance("I find your lack of faith disturbing")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        return rebels + ewoks
    }
    val rebels = calculateNumberGoodGuys(rebels = 10, ewoks = 10)
    println("Darth Vader has encoutered $rebels rebels")
    println("Darth Vader has encoutered ${calculateNumberGoodGuys(4, 5)} rebels")

    fun vaderIsFeeling(mood: String = "angry"){
        println(mood)
    }
    vaderIsFeeling("meh")
}