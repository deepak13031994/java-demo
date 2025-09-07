import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to the Java Demo!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: "  (a + b));
        sc.close();
    }
}