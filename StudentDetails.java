import java.util.Scanner;

class Student {
    void display(String name, int rollNum, double marks) {
        System.out.println(" Name       : " + name);
        System.out.println(" RollNumber : " + rollNum);
        System.out.println(" Marks      : " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Rollnumber:");
        int rollNum = sc.nextInt();

        sc.nextLine(); 

        System.out.println("Enter Marks:");
        double marks = sc.nextDouble();

        Student obj = new Student();
        obj.display(name, rollNum, marks);

        sc.close();
    }
}
