/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg04;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n :");
        int num= sc.nextInt();
        
        double sum=0, term;
        
        for(int i=1;i<=num;i++){
            term=(1.0/(i*i));
            if(i%2==0){
                sum=sum-term;
            }
            else{
                sum=sum+term;
            }
           
        }
        System.out.println("sum : " +sum);
        
    }
    
}

