import java.util.Scanner;

class Palindrome {
    void check(int n) {
        int temp = n;
        int rev = 0;

        while (temp > 0) {
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;
        }

        if (n == rev) {
            System.out.println(n + " is a Palindrome number.");
        } else {
            System.out.println(n + " is Not a Palindrome number.");
        }
    }
}

public class PalindromeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        Palindrome obj = new Palindrome();
        obj.check(num);

        sc.close();
    }
}
