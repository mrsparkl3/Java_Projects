/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Some tests for I/O Syntax
        System.out.println("I'm using github");
        Scanner var= new Scanner(System.in);
        System.out.print("Enter your text:");
        String text= var.nextLine();
        System.out.println("Your text was: "+ text);
        System.out.print("Now Enter an Integer number:");
        int num= var.nextInt();
        System.out.println("Your Integer was "+num);
        
        
    }
    
}
