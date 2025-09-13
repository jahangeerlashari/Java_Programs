package Java_Programs;

import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

    
        // This simple and one line method to print odd or even num
            System.out.println((num%2==0) ? "Even" : "Odd");

            // this second way

            System.out.println();

            if (num%2==0) {
                System.out.println("Number Even: "+num);
                
            }else{
                System.out.println("Number is Odd: "+num);
            }
        
    }
    
}
