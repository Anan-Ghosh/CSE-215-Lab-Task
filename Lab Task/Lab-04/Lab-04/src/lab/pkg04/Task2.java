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
public class Task2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int i,flag=0,n;
    
        System.out.print("Enter a number: ");
        n=sc.nextInt();
    
        if(n==0||n==1){
            System.out.println(n+" is not a Prime Number.");
        }
        else{
            for(i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println(n+" is not a Prime Number.");
                    flag=1;
                    break;
                }
            }
            if(flag==0) { 
                System.out.println(n+" is a Prime Number."); }
        }
    }
}
