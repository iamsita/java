interface Grandfather {
    abstract void write();
}

interface Father {
    void read();
}

interface child {
    void enter();
}

class xori implements Father, Grandfather, child {
    public void write() {
        System.out.println("I belong  to Grandfather class");
    }

    public void read() {
        System.out.println("I belong to Father class");
    }

    public void enter() {
        System.out.println("I belong to child class");
    }

}

public class inheritance {
    public static void main(String[] args) {
        xori obj = new xori();
        obj.write();
        obj.read();
        obj.enter();
    }
}
