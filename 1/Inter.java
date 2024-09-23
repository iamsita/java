import java.net.PortUnreachableException;

class A {
    public void A() {

    }
}

interface B {
    public void B();

}

class C extends A implements B {
    void A(){
        System.out.println("I am A");
        void B(){
            System.out.println("");

        }
      
    }

}

public class Inter {
    public static void main(String[] args) {

    }

}
