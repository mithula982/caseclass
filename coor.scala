import math.{sqrt,pow}
object coor extends App
{
    val po1=Point(4,7)
    val po2=Point(5,3)
    println("Point po1:"+" "+po1)
    println("Point po2:"+" "+po2)

    val add=po1.add(po2)
    println("\nAddition of 2 given points:"+" "+add)

    val movepo1=po1.move(2,5)
    val movepo2=po2.move(2,5)
    println("\nCoordinates of po1 moved to:"+" "+movepo1)
    println("\nCoordinates of po2 moved to:"+" "+movepo2)
    
    val dis=po1.distance(po2)
    println("\nDistance between 2 coordinates:"+" "+dis+" "+"Units")

    val inverspo1=po1.invert(po1)
    val inverspo2=po2.invert(po2)
    println("\nInversion of po1:"+" "+inverspo1)
    println("\nInversion of po2:"+" "+inverspo2)
}
case class Point(a:Int,b:Int)
{
    def p:Int=a
    def q:Int=b

    def add(r:Point)=new Point(this.p+r.p,this.q+r.q)
    def move(dp:Int,dq:Int)=Point(this.p+dp,this.q+dq)
    def invert(s:Point)=new Point(s.q,s.p)
    def distance(d:Point):Double=
    {
        sqrt(pow(this.p-d.p,2)+pow(this.q-d.q,2))
    }
}