package creational.factory


// fabrik methodu

enum class FactoryType {
    BMW, AUDI
}

interface AbstarctFactory {
    fun buildEngine()
    fun build()
}

class AbstractFactoryProvider() {
    fun getFactory(factory: FactoryType): AbstarctFactory {
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

enum class fMT {
    Iron, Gold, wood
}

interface Ifmt {
    fun ironCreate()
    fun goldCrete()
    fun woodCrete()
}

class fmtManager() {
    fun create(fMT: fMT): Ifmt {
        return when (fMT) {
            creational.factory.fMT.Gold -> GolCrete()
            creational.factory.fMT.Iron -> IrocCrete()
            creational.factory.fMT.wood -> WoodCrete()
        }
    }
}

class IrocCrete : Ifmt {
    override fun ironCreate() {
        TODO("Not yet implemented")
    }

    override fun goldCrete() {
        TODO("Not yet implemented")
    }

    override fun woodCrete() {
        TODO("Not yet implemented")
    }

}

class GolCrete : Ifmt {
    override fun ironCreate() {
        TODO("Not yet implemented")
    }

    override fun goldCrete() {
        TODO("Not yet implemented")
    }

    override fun woodCrete() {
        TODO("Not yet implemented")
    }

}

class WoodCrete : Ifmt {
    override fun ironCreate() {
        TODO("Not yet implemented")
    }

    override fun goldCrete() {
        TODO("Not yet implemented")
    }

    override fun woodCrete() {
        TODO("Not yet implemented")
    }

}

fun main() {
    var abstarctFactoryProvider = AbstractFactoryProvider()
    abstarctFactoryProvider.getFactory(FactoryType.BMW).build()

    var create = fmtManager()
    create.create(fMT.wood).ironCreate();
}