import java.util.Scanner;

class Employee {
    void display(int id, String name, double salary) {
        System.out.println(" Id : " + id);
        System.out.println(" Employee Name : " + name);
        System.out.println(" Salary : " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Id:");
        int id = sc.nextInt();
        
       
        sc.nextLine(); 
        
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter salary:");
        double salary = sc.nextDouble();
        
        Employee obj = new Employee();
        
        obj.display(id, name, salary); 
        
        sc.close();
    }
}
