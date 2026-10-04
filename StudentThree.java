import java.util.Scanner;

class Student {
    void display(String name, int roll, double marks) {
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Marks       : " + marks);
        System.out.println("-------------------------");
    }
}

public class StudentThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Roll Number: ");
        int roll1 = sc.nextInt();
        System.out.print("Marks: ");
        double marks1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nEnter details for Student 2:");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Roll Number: ");
        int roll2 = sc.nextInt();
        System.out.print("Marks: ");
        double marks2 = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("\nEnter details for Student 3:");
        System.out.print("Name: ");
        String name3 = sc.nextLine();
        System.out.print("Roll Number: ");
        int roll3 = sc.nextInt();
        System.out.print("Marks: ");
        double marks3 = sc.nextDouble();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("\n=== Students List ===");
        s1.display(name1, roll1, marks1);
        s2.display(name2, roll2, marks2);
        s3.display(name3, roll3, marks3);

        sc.close();
    }
}
