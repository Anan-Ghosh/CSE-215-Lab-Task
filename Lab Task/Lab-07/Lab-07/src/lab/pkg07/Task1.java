/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg07;
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
        // TODO code application logic her
        Scanner sc = new Scanner(System.in);
        int n, num1 = 0, num2 = 1, rslt = 0, i;
	System.out.println("Enter the n value: ");
	n = sc.nextInt();
	if(n == 0 || n == 1){
            System.out.println(n);
        }
        else{
            rslt = num1 + num2;
        }
			
	for (i = 3; i <= n; ++i)
        {
            num1 = num2;
            num2 = rslt;
            rslt = num1 + num2;
	}
	System.out.println("5th Fibonacci number: " + num2);
    }   
}



 