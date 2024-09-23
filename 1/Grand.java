

class Grandfather {
    void display(){
        System.out.println("The name of the grandfather is:hari kumar");

    }
    void dp(String name){
        System.out.println("The name of the grandfather is:"+name);
    }
}
class Father extends Grandfather{
    void display1(){
        System.out.println("my name is ram kumar");
    }
}
class Grandson extends Father{

    void display2(){
        System.out.println("my name is shiv kumar");
    }

}

class MultipleLevel { 
    public static void main (String args[]){
        Grandfather obj= new Grandson();

        obj.display2();
        obj.display1();
        obj.display();
        obj.dp("hari kumar");
       
    }
}



