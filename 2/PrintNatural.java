public class PrintNatural {
    public static void printNumber(int n) {
        System.out.print(n + " ");

        if (n > 1)
            printNumber(n - 1);

    }

    public static void main(String[] args) {
        System.out.println("Using loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.err.println();
        System.out.println("Using recursion:");
        printNumber(10);

    }
}