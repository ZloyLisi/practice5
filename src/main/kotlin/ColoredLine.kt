class ColoredLine():Line()
{
    var color: String? = null

    constructor(_x:Double, _y:Double, _x2:Double, _y2:Double, _color:String):this()
    {
        x = _x
        y = _y
        x2 = _x2
        y2 = _y2
        color = _color
    }

    override fun printInf()
    {
        println("Координаты: x1 = $x, y1 = $y, x2 = $x2, y2 = $y2. Цвет: $color")
    }
}