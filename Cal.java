import java.util.Scanner;

class Main {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of 2 ints: " + sum);
    }

    void add(int a, int b, int c) {
        int sum1 = a + b + c;
        System.out.println("Sum of 3 ints: " + sum1);
    }

    void add(double a, double b) {
        double sum2 = a + b;
        System.out.println("Sum of 2 doubles: " + sum2);
    }
}

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main c = new Main();

        System.out.println("Enter 2 integers:");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        c.add(a1, b1);

        System.out.println("Enter 3 integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        c.add(x, y, z);

        System.out.println("Enter 2 double values:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        c.add(d1, d2);

        sc.close();
    }
}
