import java.util.Scanner;

class Calculator {
    void num(double a, double b) {
        double add = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        System.out.println();
        System.out.println("Add : " + add);
        System.out.println("Sub : " + sub);
        System.out.println("Mul : " + mul);
        System.out.println("Div : " + div);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Num1 : ");
        double num1 = sc.nextDouble(); 

        System.out.print("Enter Num2 : ");
        double num2 = sc.nextDouble(); 
        
        Calculator obj = new Calculator();
        obj.num(num1, num2);
        
        sc.close();
    }
}
