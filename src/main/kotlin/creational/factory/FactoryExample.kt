package creational.factory


// fabrik methodu

enum  class FactoryType {
    BMW, AUDI
}

interface AbstarctFactory {
    fun buildEngine()
    fun build()
}

class AbstractFactoryProvider() {
    fun getFactory(factory: FactoryType) : AbstarctFactory {
        when (factory) {
            FactoryType.AUDI -> return AudiFactory()

            FactoryType.BMW -> return BmvFactory()
        }

    }
}

class AudiFactory() : AbstarctFactory {
    override fun buildEngine() {

    }

    override fun build() {

    }

}

class BmvFactory() : AbstarctFactory {
    override fun buildEngine() {

    }

    override fun build() {

    }

}

fun main() {
    var abstarctFactoryProvider =  AbstractFactoryProvider()
    abstarctFactoryProvider.getFactory(FactoryType.BMW).build()
}