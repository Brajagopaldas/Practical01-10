import java.util.Scanner;

class Main {
    void reactArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println();
        System.out.println("Length : " + length);
        System.out.println("Breadth : " + breadth);
        System.out.println("Area : " + area);
    }
}

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length : ");
        double length = sc.nextDouble();

        System.out.println("Enter breadth : ");
        double breadth = sc.nextDouble();

        Main obj = new Main();
        obj.reactArea(length, breadth);
        
        sc.close();
    }
}
