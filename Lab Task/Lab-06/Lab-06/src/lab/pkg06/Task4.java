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
public class Task4 {
    public static void main(String[] args){  
  
        Scanner sc = new Scanner(System.in);
 
        int i,j,row,col,temp;
        System.out.print("Enter the number of rows:");
        row = sc.nextInt();
        System.out.print("Enter the number of columns:");
        col = sc.nextInt();
        
        int [][] original= new int [row][col];
        int [][] transpose=new int[col][row];    
        
        for(i=0;i<row;i++)
        {    
            for(j=0;j<col;j++)
            {    
                original[i][j]=sc.nextInt();
            }    
        }    
        
        System.out.println("Printing Matrix without transpose:");  
        for(i=0;i<row;i++)
        {    
            for(j=0;j<col;j++)
            {    
                System.out.print(original[i][j]+" ");    
            }    
            System.out.println();    
        }    

        for(i=0;i<row;i++)
        {    
            for(j=0;j<col;j++)
            {    
                temp=original[i][j];
                for (int x=0; x<col;x++)
                {
                   for(int y=0;y<row;y++)
                   {
                        transpose[x][y]=temp; 
                    }
                }
            }    
        }    
  
       
        System.out.println("Printing Matrix After Transpose:");  
        for(i=0;i<col;i++)
        {    
            for(j=0;j<row;j++)
            {    
                System.out.print(transpose[i][j]+" ");    
            }    
            System.out.println(); 
        }    
    }       
}