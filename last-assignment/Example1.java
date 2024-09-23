//wap of your choice to show the implementation of this keyword

class Example1
{
    public int x = 10;
    public void display()
    {
        // int x = 20;
        System.out.println("Value of x is: "+x);
        System.out.println("Value of x is: "+this.x);
    }
    public static void main(String[] args)
    {
        Example1 obj = new Example1();
        obj.display();
    }
}

//wap that has tow functions with name one for the addition of tho integers and other for the addition of three integers.

class Example2
{
    void add(int a, int b)
    {
        System.out.println("Addition of two integers is: "+(a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("Addition of three integers is: "+(a+b+c));
    }
    public static void main(String[] args)
    {
        Example2 obj = new Example2();
        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
//wap that has two functions with the same name and the same number of arguments ,one for the addition of two integers and other for the addition of two double values.

class Example3
{
    void add(int a, int b)
    {
        System.out.println("Addition of two integers is: "+(a+b));
    }
    void add(double a, double b)
    {
        System.out.println("Addition of two double values is: "+(a+b));
    }
    public static void main(String[] args)
    {
        Example3 obj = new Example3();
        obj.add(10, 20);
        obj.add(10.5, 20.5);
    }
}
// Write a program to define a class Circle with its data members pi and r and members functionsgetdata() for initializing data members and calculate() for finding the area of a circle. Return the resultfrom calculate() and display the result in main() function. Use pi as a constant.

class Circle
{
    final double pi = 3.14;
    double r;
    void getdata(double r)
    {
        this.r = r;
    }
    double calculate()
    {
        return pi*r*r;
    }
    public static void main(String[] args)
    {
        Circle obj = new Circle();
        obj.getdata(5);
        System.out.println("Area of circle is: "+obj.calculate());
    }
}
//Write a program to implement encapsulation using getter and setter methods.

class Encapsulation
{
    private String name;
    private int age;
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public static void main(String[] args)
    {
        Encapsulation obj = new Encapsulation();
        obj.setName("John Doe");
        obj.setAge(30);
        System.out.println("Name: "+obj.getName());
        System.out.println("Age: "+obj.getAge());
    }
}
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