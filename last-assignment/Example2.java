
// Create a class named Person which has name & age as data members and appropriate function
// members to read and display its data. Create another class Employee derived from the class Person to
// use features of the base class (single).

class Person
{
    String name;
    int age;
    void setData(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayData()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee extends Person
{
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.setData("John Doe", 30);
        obj.displayData();
    }
}
//Create a class Polygon with data members: dimension1 and dimension2 and a member function:
//ReadDimension() to read data members. Derive two classes Rectangle and Triangle from the Polygon
//class with appropriate member function to calculate the area of each rectangle and triangle
//(multilevel).

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