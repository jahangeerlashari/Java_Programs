package Java_Programs;

import java.util.Scanner;

public class BasicForm {

    public static void main(String[] args) {
        
        //We use here Scanner Class For input 

        Scanner input = new Scanner(System.in); // and here I create an obect of Scanner Class Which I import 

        System.out.println("Enter your name: ");
        String name = input.nextLine(); 
        System.out.println("Enter your father name: ");
        String fName = input.nextLine();
       // input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your grade: ");
        int grade = input.nextInt();

        // Now I create a display Basic Form Entered Data

        System.out.println("Name of student is : "+name);
        System.out.println("Student Father name is : "+fName);
        System.out.println("Student Age is : "+age);
        System.out.println("Student Grade is : "+grade);

        input.close(); 



    }
    
}
