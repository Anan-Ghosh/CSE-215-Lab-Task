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
public class Task2 {
    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");

    // nextDouble() reads the next double from the keyboard
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();

    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = sc.next().charAt(0);

    double result;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;

      case '-':
        result = num1 - num2;
        break;

      case '*':
        result = num1 * num2;
        break;

      case '/':
        result = num1 / num2;
        break;

      // operator doesn't match any case constant (+, -, *, /)
      default:
        System.out.printf("Error! operator is not correct");
        return;
    }

    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}

