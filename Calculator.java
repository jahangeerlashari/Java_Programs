package Java_Programs;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        int num1;
        int num2;

            choice = Integer.parseInt(JOptionPane.showInputDialog("1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for exit"));



        switch (choice){
            case 1:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st no here"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd no here"));
                int sum = num1+num2;
                JOptionPane.showMessageDialog(null,"Sum is "+sum);
                break;
            case 2:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st no here"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd no here"));
                int sub = num1-num2;
                JOptionPane.showMessageDialog(null,"Subtraction is "+sub);
                break;
            case 3:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st no here"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd no here"));
                int mul = num1*num2;
                JOptionPane.showMessageDialog(null,"Multiplication is  is "+mul);
                break;
            case 4:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st no here"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd no here"));
                int div = num1/num2;
                JOptionPane.showMessageDialog(null,"Division is "+div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong button pressed");

        }


    }
}

