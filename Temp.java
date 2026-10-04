import java.util.Scanner;

class Temperature {
    void convert(double celsius, double fahrenheit) {
        double toFahrenheit = (celsius * 9.0 / 5.0) + 32;
        double toCelsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println("\n--- Temperature Conversion ---");
        System.out.println("Celsius to Fahrenheit    : " + celsius + "°C = " + toFahrenheit + "°F");
        System.out.println("Fahrenheit to Celsius    : " + fahrenheit + "°F = " + toCelsius + "°C");
    }
}

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();

        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();

        Temperature obj = new Temperature();

        obj.convert(celsius, fahrenheit);

        sc.close();
    }
}
