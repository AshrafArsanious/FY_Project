package Fibonacci;

public class Fibonancci {

    public static void main(String[] args) {
        int n = 10; // You can change this to generate Fibonacci numbers up to a different limit
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
