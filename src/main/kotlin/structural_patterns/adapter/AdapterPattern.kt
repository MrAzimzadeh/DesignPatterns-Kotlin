package structural_patterns.adapter

class Elephant {
    fun wals() {
    }
}

interface AnimalAdapter {
    fun swim(elephant: Elephant)
}

class Dolphin() : AnimalAdapter {
    override fun swim(elephant: Elephant) {
        elephant.wals()
    }
}

class AdapterPattern {}


fun main() {

    var elephant = Elephant();
    var swimAdapter = Dolphin();


}