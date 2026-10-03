import java.util.Scanner; 

class Main { 
    // This method belongs to the Main class
    void result(int marks1, int marks2, int marks3) { 
        int total = marks1 + marks2 + marks3; 
        int average = total / 3; 
        
        // Added missing double quotes around strings
        System.out.println("\n--- Student Details ---"); 
        System.out.println("Sub1 Marks : " + marks1); 
        System.out.println("Sub2 Marks : " + marks2); 
        System.out.println("Sub3 Marks : " + marks3); 
        System.out.println("Total Marks : " + total); 
        System.out.println("Average Marks : " + average + "%"); 
    } 
} 

class Student { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter Marks of Sub1 : "); 
        int marks1 = sc.nextInt(); 
        
        System.out.print("Enter Marks of Sub2 : "); 
        int marks2 = sc.nextInt(); 
        
        System.out.print("Enter Marks of Sub3 : "); 
        int marks3 = sc.nextInt(); 
        
        // Fixed: Instantiated Main instead of Student to access result()
        Main obj = new Main(); 
        obj.result(marks1, marks2, marks3); 
        
        sc.close(); 
    } 
}
