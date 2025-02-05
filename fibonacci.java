import java.util.Scanner;

public class Main {

    public static void printFibonacci(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2); // printing 0 and 1

        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements to be shown in the Fibonacci series: ");
        int count = scanner.nextInt();
        printFibonacci(count);
        scanner.close();
    }
}
