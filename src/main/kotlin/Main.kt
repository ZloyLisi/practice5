fun main(args: Array<String>)
{
    //точка

    val point = Point(2.0,3.0)
    point.printInf()

    //цветная точка

    val coloredPoint = ColoredPoint(4.0,5.0,"красный")
    coloredPoint.printInf()

    //линия

    val line = Line(6.0, 7.0, 8.0, 9.0)
    line.printInf()

    //цветная линия

    val coloredLine = ColoredLine (10.0, 11.0, 12.0, 13.0, "синий")
    coloredLine.printInf()

}
