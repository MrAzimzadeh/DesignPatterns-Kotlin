package structural_patterns.decarator

interface ITree {
    fun decorate();
}
class ChristmasTree() : ITree {
    override fun decorate() {
        TODO("Not yet implemented")
    }
}
class IyneYarpagli() : ITree {
    override fun decorate() {
        TODO("Not yet implemented")
    }
}
abstract class TreeDecorator( var  iTree: ITree) {
    open fun superDecorator() {
       iTree.decorate()
    }
}class CHTree(iTree: ITree) : TreeDecorator(iTree) {
    open fun superDecorator() {
        super.superDecorator()
        bubbleLights()
    }

    private fun bubbleLights() {
        return " "
    }


}

class  YerliChristmenAgaci(iTree: ITree) : TreeDecorator(iTree)
{
    override fun superDecorator() {
        super.superDecorator()
        pambiqDuzmek()
    }

    private fun pambiqDuzmek() {
        TODO("Not yet implemented")
    }
}





interface  MyCar{
    fun engineBuilde()
}
class  Audi() : MyCar{
    override fun engineBuilde() {

    }
}

class  Vaz() : MyCar {
    override fun engineBuilde() {
        TODO("Not yet implemented")
    }
}

class  Kamaz() :  MyCar {
    override fun engineBuilde() {

    }

}


abstract  class  CarEngine(var item : MyCar)
{
    open fun engineBuilde {
        item.engineBuilde()
    }
}

class  AudiEngine() :  CarEngine(Audi()){
    override fun engineBuilde(){
        super.engineBuilde()
        createCar()
    }

    private fun createCar() {
        TODO("Not yet implemented")
    }
}


fun main ()
{
    var test =  AudiEngine().engineBuilde();
}