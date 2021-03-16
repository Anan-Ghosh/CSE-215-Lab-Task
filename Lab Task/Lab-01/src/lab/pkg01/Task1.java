/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg01;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Your Name: ");
        String name= sc.nextLine();
        System.out.print("Enter your Department: ");
        String depart= sc.nextLine();
        System.out.print("Enter your Age: ");
        int age= sc.nextInt();
        
        
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("Depertment: "+ depart);
    }
    
}
