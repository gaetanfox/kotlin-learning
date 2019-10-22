import java.util.concurrent.CompletableFuture

fun main() {
    val printMessage = {message: String -> println(message)}
    printMessage("Hello World")

    val sumA = {x: Int, y: Int -> x +y}
    println(sumA(3,2))
    val sumB : (Int, Int) -> Int = {x,y -> x+y}

    fun downloadData(url: String, completion: () -> Unit){
        // sent a download request
        //we got back data
        // there were no network error
        completion()
    }
    //call downloadData function
    downloadData("fakeurl.com") {
        println("Only executed after completion()")
    }

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        //Sent dl req
        //got back car data
        val car = Car("Tesla", "Model X", "Blue")
        completion(car)
    }

    downloadCarData("fakeurl.com"){ car ->
        println(car.color)
        println(car.make)
        println(car.model)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit){
        //make web req
        //get res
        val webRequestSuccess = true
        if (webRequestSuccess) {
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeurl.com") { truck, success ->
        if (success) {
            // do stuff
            truck?.park()
        } else  {
            println("Something went wrong")
        }
    }
}