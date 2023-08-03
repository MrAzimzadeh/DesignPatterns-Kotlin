package builder_exam

import creational.builder.boilerplate.pattern.Coffe

class CarExam(add: Boolean , full: Boolean ) {
    class  Builder() {
        var addB = true;
        var fullB = true;

        fun setAdd(add: Boolean): Builder {
            this.addB = add;
            return  this

        }

        fun setFull(full: Boolean) : Builder
        {
            this.fullB = full
            return  this
        }
        fun build () : CarExam{
            return  CarExam(addB , fullB)
        }
    }
}

fun main(){
    var test = CarExam.Builder().setAdd(true).setFull(false).build();
}