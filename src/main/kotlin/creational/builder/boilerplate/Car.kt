package creational.builder.boilerplate

class Car {
    var wheels  : Int  = 0
    var engine : Engine? = null
}

class Engine(
    var power : String
)