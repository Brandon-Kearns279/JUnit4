/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit4;

import java.util.Scanner;

/**
 *
 * @author Brandon Kearns
 */
public class JUnit4 {

    public static void main(String[] args) {
        float b;
        float h;
        float hy;
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the base of the triangle: ");
        b = in.nextFloat();
        
        System.out.println("Enter the height of the triangle: ");
        h = in.nextFloat();
        
        System.out.println("Enter the hypo of the triangle: ");
        hy = in.nextFloat();
        
        Triangle Alpha = new Triangle(b, h, hy);
        
    }
    
}
