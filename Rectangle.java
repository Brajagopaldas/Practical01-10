import java.util.Scanner;
class Rectangle {
    void reactArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println();
        System.out.println("Lenght : " + length);
        System.out.println("Breadth : " + breadth);
        System.out.println("Area : " + area);
    }
}
class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter length : ");
    double length = sc.nextDouble();

    System.out.println("Enter Breadth : ");
    double breadth = sc.nextDouble();

    Rectangle obj = new Rectangle();
    obj.reactArea(length, breadth);
    sc.close();
    }
}       
