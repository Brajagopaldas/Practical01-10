import java.util.Scanner;

class Main {
    void circle(double radius) {
        double area = 3.14 * radius * radius;
        double cf = 2 * 3.14 * radius;
        System.out.println();
        System.out.println("Radius : " + radius);
        System.out.println("Area : " + area);
        System.out.println("Circumference : " + cf);
    }
}

class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        
        double radius = sc.nextDouble(); 
        
        Circle obj = new Circle();
        obj.circle(radius);
        
        sc.close();
    }
}
