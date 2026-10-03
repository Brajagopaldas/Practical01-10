import java.util.Scanner;

class Product {
    void Price(String name, double price, double discountPercent) {
        double discountAmount = (discountPercent / 100.0) * price;
        double finalPrice = price - discountAmount;

        System.out.println("\n--- Product Invoice ---");
        System.out.println("Product Name   : " + name);
        System.out.println("Original Price : Rs. " + price);
        System.out.println("Discount (" + discountPercent + "%) : Rs. " + discountAmount);
        System.out.println("Final Price    : Rs. " + finalPrice);
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Name:");
        String name = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Discount Percentage:");
        double discount = sc.nextDouble();

        Product p = new Product();
        p.Price(name, price, discount);

        sc.close();
    }
}