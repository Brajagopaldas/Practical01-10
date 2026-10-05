import java.util.Scanner;

class Main {
    void generateBill(double p1, double p2, double p3, double discount) { 
        double total = p1 + p2 + p3; 
        double discountAmount = (discount / 100.0) * total; 
        double finalBill = total - discountAmount; 
        
        System.out.println("\n--- Shopping Bill ---"); 
        System.out.println("Item 1 Price : Rs. " + p1); 
        System.out.println("Item 2 Price : Rs. " + p2); 
        System.out.println("Item 3 Price : Rs. " + p3); 
        System.out.println("Total Amount : Rs. " + total); 
        System.out.println("Discount (" + discount + "%) : Rs. " + discountAmount); 
        System.out.println("Final Payable : Rs. " + finalBill); 
    } 
} 

public class ShoppingCart { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter price of Item 1:"); 
        double p1 = sc.nextDouble(); 
        System.out.println("Enter price of Item 2:"); 
        double p2 = sc.nextDouble(); 
        System.out.println("Enter price of Item 3:"); 
        double p3 = sc.nextDouble(); 
        System.out.println("Enter Discount Percentage:"); 
        double discount = sc.nextDouble(); 
        
        Main cart = new Main(); 
        cart.generateBill(p1, p2, p3, discount); 
        
        sc.close(); 
    } 
}
