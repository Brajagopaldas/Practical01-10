import java.util.Scanner;

class Car {
    void display(String brand, String model, int year) {
        System.out.println("\n--- Car Information ---");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }

    void start(String brand, String model) {
        System.out.println(brand + " " + model + " engine has started.");
    }

    void stop(String brand, String model) {
        System.out.println(brand + " " + model + " engine has stopped.");
    }
}

public class CarDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Brand:");
        String brand = sc.nextLine();

        System.out.println("Enter Model:");
        String model = sc.nextLine();

        System.out.println("Enter Year:");
        int year = sc.nextInt();

        Car myCar = new Car();

        myCar.display(brand, model, year);
        myCar.start(brand, model);
        myCar.stop(brand, model);

        sc.close();
    }
}
