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
public class Task3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give a number: ");
        int n=sc.nextInt();
        
        if (n%2==0)
        {
            System.out.println(n+" is Even");
        }
        else
        {
            System.out.println(n+" is Odd");
        }
        
        
        
    }
    
}
