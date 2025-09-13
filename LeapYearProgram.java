package Java_Programs;

import java.util.Scanner;

public class LeapYearProgram {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Scanner Class For input

        System.out.println("Enter the Year: ");
        int year = input.nextInt();
        
        if(year%4==0){
            System.out.println("leap year: "+year);
        }else{
            System.out.println("not a leap year: "+year);
        }
    
    }
    
}
