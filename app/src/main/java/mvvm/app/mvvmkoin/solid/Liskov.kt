package mvvm.app.mvvmkoin.solid
/*

open class Car{
    fun getCabinWidth():Int = 40
}
class RacingCar: Car() {
    fun cockpitWidth():Int = 12
}

fun main() {
    val list = mutableListOf(
        RacingCar(),
        Car()
    )

    list.forEach {
        when(it){
            is RacingCar -> {
                println(it.cockpitWidth())
            }
            is Car ->{
                print(it.getCabinWidth())
            }
        }
    }
}



*/

// apply


open  class Vehicle{
     open  fun getInteriorWidth():Int =0
}

class CarNew:Vehicle(){
    override fun getInteriorWidth(): Int {
        return this.getCabinWidth()
    }
    private fun getCabinWidth():Int = 39
}

class RacingCarNer:Vehicle(){
    override fun getInteriorWidth(): Int {
        return this.cockpitWidth()
    }
    private fun cockpitWidth():Int = 12
}

fun main() {
    val list = listOf(CarNew(),RacingCarNer())
    list.forEach {
        print(it.getInteriorWidth())
    }
}