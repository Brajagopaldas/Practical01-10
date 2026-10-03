import java.util.Scanner; 

class Main { 
    void display(int bookId, String bookName, double price) { 
        System.out.println("\n--- Book Details ---"); 
        System.out.println("Book ID : " + bookId); 
        System.out.println("Book Name : " + bookName); 
        System.out.println("Price : " + price); 
    } 
} 

class Book { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter Book Id : "); 
        int id = sc.nextInt(); 
        sc.nextLine(); 
        
        System.out.print("Enter Book Name : "); 
        String name = sc.nextLine(); 
        
        System.out.print("Enter Book Price : "); 
        double price = sc.nextDouble(); 
        
        Main obj = new Main(); 
        obj.display(id, name, price); 
        
        sc.close(); 
    } 
}
