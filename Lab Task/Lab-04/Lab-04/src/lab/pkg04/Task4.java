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
public class Task4 {  
  public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter N:" );
      int rows = sc.nextInt();

    for (int i = 1; i<=rows; i++) {
      for (int j = 1; j<=i; ++j) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
