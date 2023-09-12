open class Line():Point()
{
    var x2:Double? = null
    var y2:Double? = null

    constructor(_x:Double, _y:Double, _x2:Double, _y2:Double): this ()
    {
        x = _x
        y = _y
        x2 = _x2
        y2 = _y2
    }

    override fun printInf()
    {
        println("Координаты: x1 = $x, y1 = $y, x2 = $x2, y2 = $y2")
    }
}