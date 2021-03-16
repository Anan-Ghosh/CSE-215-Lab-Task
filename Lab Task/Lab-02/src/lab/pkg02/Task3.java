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
public class Task3 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        
        for(int i=1; i<=n; i++){
          if( i%2==1)
          {
            for( int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
          }
          else
          {
              for( int j=1; j<=(2*i)-1;j++){
                System.out.print("+");
              }
              
          }
            System.out.println();
           
        }
            
    }
}
