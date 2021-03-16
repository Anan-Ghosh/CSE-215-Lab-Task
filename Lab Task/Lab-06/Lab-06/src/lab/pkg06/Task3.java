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
public class Task3 {

     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        int i,j,row,col;
        System.out.print("Enter the number of rows:");
        row = sc.nextInt();
        System.out.print("Enter the number of columns:");
        col = sc.nextInt();
 
        int[][] arr1 = new int[row][col];
        int[][] arr2= new int [row][col];
        int[][] sum=new int [row][col];
        System.out.println("Enter the elements of the matrix of arr1:") ;
        for(i=0;i<row;i++)
        { 
            for(j=0;j<col;j++)
            { 
                arr1[i][j] = sc.nextInt();
            }
        }
 
        System.out.println("The elements of the matrix of arr1:") ;
        for(i=0;i<row;i++)
        { 
            for(j=0;j<col;j++)
            { 
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println("");
        }
        
        
        System.out.println("Enter the elements of the matrix of arr2:") ;
        for(i=0;i<row;i++)
        { 
            for(j=0;j<col;j++)
            { 
                arr2[i][j] = sc.nextInt();
            }
        }
 
        System.out.println("The elements of the matrix arr2:") ;
        for(i=0;i<row;i++)
        { 
            for(j=0;j<col;j++)
            { 
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println("");
        }
        
        for(i=0;i<row;i++)
        { 
            for(j=0;j<col;j++)
            { 
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum Matrix:");
        for(i=0;i<row;i++)
        { 
            for(j=0;j<col;j++)
            { 
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println("");
        }
        
        
   }
}     