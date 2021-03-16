/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02;
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
        int i=0,sum=0;
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum: "+sum);
        
                
    }
    
}
