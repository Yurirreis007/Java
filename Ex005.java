/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex005;

import java.util.Scanner;

/**
 *
 * @author yurireis1246
 */
public class Ex005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod1, cod2, num1, num2;
        double val1, val2;
        
        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        val1 = sc.nextDouble();
        
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        val2 = sc.nextDouble();
        
        double valTotal = (num1 * val1) + (num2 * val2);
        
        System.out.printf("VALOR A PAGAR: %.2f%n", valTotal);
        
        sc.close();
    }
}
