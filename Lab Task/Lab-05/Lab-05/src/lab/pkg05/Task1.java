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
public class Task1 {

    public static int isPerfect(int n){
        int sum=0;
        for(int i=1; i<n ; i++){
            if (n%i==0){
                sum=sum+i;
            }
        }
        if (n==sum){
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        for (int i=2; i<=n ; i++){
            int x=isPerfect(i);
            if (x==1){
                System.out.print(i+" ");
            }
        }
    }
}
