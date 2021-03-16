/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg06;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Task01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] num = new int[10];
        System.out.print("Enter the elements: ");
        for (int i=0; i<num.length; i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.print("Enter a number to search: ");
        int n = sc.nextInt();
        boolean found = false;

        for (int i=0; i<num.length; i++) {
            if (n == num[i]) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.print(n + " is found.");
        else
            System.out.print(n + " is not found.");
    
    }
    
}
