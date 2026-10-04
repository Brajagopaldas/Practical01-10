import java.util.Scanner;

class Factorial {
    long find(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

public class FactorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        Factorial obj = new Factorial();
        long result = obj.find(num);

        System.out.println("Factorial of " + num + " : " + result);

        sc.close();
    }
}
