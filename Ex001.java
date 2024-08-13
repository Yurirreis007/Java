/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex001;

import java.util.Scanner;

/**
 *
 * @author yurireis1246
 */
public class Ex001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        System.out.println("SOMA = " + (num1 + num2));
        sc.close();
    }
}
