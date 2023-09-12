open class Point()
{
    var x:Double? = null
    var y:Double? = null

    constructor(_x:Double, _y:Double): this()
    {
        y = _y
        x = _x

    }

    open fun printInf()
    {
        println("Координата x = $x и y = $y ")
    }
}