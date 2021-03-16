/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02;
import java.util.Scanner;
import java.lang.Math.*;
/**
 *
 * @author User
 */
public class Task4 {
    public static void main(String[] args){
        
        
        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            double d = b * b - 4.0 * a * c;

            if (d > 0.0) {
                double num1 = ((-b + Math.sqrt(d)) / (2.0 * a));
                double num2 = ((-b - Math.sqrt(d)) / (2.0 * a));
                System.out.println("Root1: " + num1);
                System.out.println("Root2: "+num2);
            } else if (d == 0.0) {
                double num3 = -b / (2.0 * a);
                System.out.println("The root is " + num3);
            } else {
                double img= Math.sqrt(-d);
                double num3 = -b / (2.0 * a);
                System.out.println("The root1 is " + num3 +" and imaginary is " +img+"i");
                System.out.println("The root2 is " + num3 +"2 and imaginary is " +img+"i");
            }
    }
}
