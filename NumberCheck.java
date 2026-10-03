import java.util.Scanner;

class Number {
    void EvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    void PositiveNegative(int n) {
        if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println(n + " is Zero");
        }
    }

    void Prime(int n) {
        if (n <= 1) {
            System.out.println(n + " is Not Prime");
            return;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        Number obj = new Number();

        System.out.println("\n--- Results ---");
        obj.EvenOdd(num);
        obj.PositiveNegative(num);
        obj.Prime(num);

        sc.close();
    }
}