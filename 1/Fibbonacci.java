public class Fibbonacci {
    public static int fibo(int n){
        if(n == 1 || n == 0){
            return n;

        } else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static int fiboI(int i){
        if(i== 1 || i== 0)
            return i;
        int n1 = 0,n2 = 2, fibo = 0;
        for(int j = 0;j < i;j++){
            fibo = n1+n2;
            n1=n2;
            n2=fibo;
        }
        return fibo;
        
    }
    public static void main(String[]args){
        int n = 3;
        System.out.println("Fibo of "+n+"using recursion is:"+fibo(n));
        System.out.println("Fibo of"+n+"using itration is:"+fibo(n));
    }
}
