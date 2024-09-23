
class Polygon
{
    int dimension1;
    int dimension2;
    void ReadDimension(int dimension1, int dimension2)
    {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    
    }
}
class Rectangle extends Polygon
{
    void area()
    {
        System.out.println("Area of Rectangle: "+(dimension1*dimension2));
    }
}
class Triangle extends Rectangle
{
    void area()
    {
        System.out.println("Area of Triangle: "+(0.5*dimension1*dimension2));
    }
    public static void main(String[] args)
    {
        Triangle obj = new Triangle();
        obj.ReadDimension(10, 20);
        obj.area();
    }
}