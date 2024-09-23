public class Shapes {
    public void area() {
        System.out.println("The formula for area of");
    }

}

class Tringle extends Shapes {
    public void area() {
        System.out.println("tringle is A 1/2 * base * height");
    }

    public void parentArea() {
        super.area();
    }
}

class Circle extends Tringle {
    public void area() {
        System.out.println("circle is 3.14*radius*radius");
    }

    public void parentArea() {
        super.area();
    }
}

class Main {
    public static void main(String[] args) {
        Shapes myShapes = new Shapes();
        myShapes.area();

        Tringle myTringle = new Tringle();
        myTringle.area();
        myTringle.parentArea();

        Circle myCircle = new Circle();
        myCircle.area();
        myCircle.parentArea();
    }

}
