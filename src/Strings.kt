fun main() {
    val str = "May the force be with you"

/*    val rawCrawl = """|
        |A long time ago,
        |in a galaxy,
        |far, far, away...
        |BUM BUM BUUUUUM
    """.trimMargin()
    println(rawCrawl)*/

/*    for (char in str1) {
        println(char)
    }
    val contentEquals = str.contentEquals("May the force be with you")
    println(contentEquals)
    val contains = str.contains("force", true)
    println(contains)
    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()
    println(uppercase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)*/
    val subsequence = str.subSequence(4,13)
    println(subsequence)
    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle")
    println("Luke's full name $luke has ${luke.length} characters")
}