/*class Car constructor(val make: String, val model: String, var color: String) {
    fun accelerate(){
        println("Vroom vroom")
    }
    fun details(){
    println("This is a $color $make $model")
    }
}

class Truck(val make: String, val model: String, val towingCapacity: Int) {
    fun tow() {
        println("Taking the horses to the rodeo")
    }
    fun details(){
        println("This $make $model has a towing capacity of $towingCapacity")
    }
}*/

open class Vehicle(val make: String, val model: String) {
    open fun accelerate(){
        println("Vroom vroom")
    }
    fun park(){
        println("parking the vehicle")
    }
    fun brake(){
        println("STOP")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("We are going on electricity")
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model)

fun main() {
/*    val car = Car("Toyota", "Avalon", "red")
    println(car.make)
    println(car.model)
    car.details()
    car.accelerate()

    val truck = Truck("Ford", "F-150", 10000)
    truck.tow()
    truck.details()*/
    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()
    val truck = Truck("Ford", "F-150", 10000)
    truck.brake()
}