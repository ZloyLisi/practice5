class ColoredPoint():Point()
{
    var color: String? = null

    constructor(_x:Double, _y:Double, _color:String): this()
    {
        x = _x
        y = _y
        color = _color
    }

    override fun printInf()
    {
        println("Координаты x = $x, y = $y. Цвет: $color")
    }


}
