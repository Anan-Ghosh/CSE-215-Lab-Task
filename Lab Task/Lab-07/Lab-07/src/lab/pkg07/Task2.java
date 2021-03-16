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
public class Task2 {
    public static void main(String[] args){
       int [] arr={1, 2, 1, 3, 4, 1, 3, 6};
       
       int count=0;
       
       int i=0;
       while(i<arr.length){
           for(int x=0;x<arr.length;x++)
           {
               if(arr[x]==i)
                   count++;
           }
           i++;
           System.out.println("Frequency of "+i+":"+count);
       }
    }   
}