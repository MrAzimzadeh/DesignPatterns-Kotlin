package creational.builder.boilerplate.pattern

data class MyCar(var wheels: Int, var enginePower: String) {
    class Builder() {
        var wheelCount = 0;
        var enginePower: String = " ";
        fun setWheels(wheelCount: Int): Builder {
            this.wheelCount = wheelCount
            return this
        }

        fun setEngine(enginePower: String): Builder {
            this.enginePower = enginePower
            return this
        }

        fun build(): MyCar {
            return MyCar(wheelCount, enginePower)
        }
    }
}

fun main() {
    var myCar = MyCar.Builder().setEngine("Engine").setWheels(3).build()
    var myCoffe = Coffe.Builder().setExtraCaramel("sa").build();
}


data class Coffe(var extraCaramel: String, var extraCrem: String) {
    // yeniden  icerisine girmek ucun yazilirr return tipi
    class Builder() {
        var extraCaramel = "";
        var extraCrem: String = " ";
        fun setExtraCaramel(Caramel: String) : Builder{
            this.extraCaramel = Caramel
            return  this
        }

        fun setExtraCrem(crem : String ) : Builder{
            this.extraCrem = crem
            return  this
        }
        fun build() :  Coffe {
            return  Coffe(extraCaramel , extraCrem)
        }
    }
}
