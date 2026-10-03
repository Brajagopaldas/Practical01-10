import java.util.Scanner;

class Main {
    void calculate(double basic) {
        double hra = (20.0 / 100.0) * basic;
        double da = (10.0 / 100.0) * basic;
        double salary = basic + hra + da;
        
        System.out.println("\n--- Employee Salary ---"); 
        System.out.println("Basic Salary : " + basic);
        System.out.println("HRA(20%) : " + hra);
        System.out.println("DA(10%) : " + da);
        System.out.println("Total Salary : " + salary);
    }
}

class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Salary: "); 
        double basic = sc.nextDouble();
        
        Main obj = new Main();
        obj.calculate(basic);
        
        sc.close();
    }
}
