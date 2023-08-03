package codesmells

class LongMethod {
    fun callMethod(model : MyParams)
    {

    }
}
fun main (){
    var myParam = MyParams("");
    LongMethod().callMethod(myParam);
}

data class MyParams(var first: String var second: String , var third: String , var fourth: String)