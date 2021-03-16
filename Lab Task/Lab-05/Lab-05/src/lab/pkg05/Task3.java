/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg05;
import java.util.Scanner;
/**
 *
 * @author User
 */

public class Task3 {
    
    public static boolean isPrime(int n){
        int i;
    
        if (n <= 1) {  
           return false;
        }
        else{
            for(i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
            }
        }
    
    public static void generatePrime(int a, int b){
        
        for(int i=a; i<=b; i++){
            boolean x= isPrime(i);
            if (x== true){
                System.out.println(i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        generatePrime(a,b);
                
    }
    
}
