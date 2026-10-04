import java.util.Scanner;

class VotingSystem {
    void check(String name, int age) {
        System.out.println("\n--- Voter Verification ---");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);

        if (age >= 18) {
            System.out.println("Status : Eligible to vote");
        } else {
            System.out.println("Status : Not eligible to vote");
        }
    }
}

public class VotingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        VotingSystem vs = new VotingSystem();
        vs.check(name, age);

        sc.close();
    }
}
