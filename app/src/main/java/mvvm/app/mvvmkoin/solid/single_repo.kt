package mvvm.app.mvvmkoin.solid

/* this class not have single responsibility principle*/
class Square{
    fun calArea(side:Int)= side*side
    fun calPerimeter(side: Int)=side*4
    fun renderSquare() = print("render square")
    fun renderLargeSquare(side: Int) = print("render large square")
}


/*let find out snippet in how to manage single responsibility*/
/* this class have single responsibility principle*/

class SquareCal{
    fun calArea(side:Int)= side*side
    fun calPerimeter(side: Int)=side*4
}
class SquareUi{
    fun renderSquare() = print("render square")
    fun renderLargeSquare(side: Int) = print("render large square")
}

