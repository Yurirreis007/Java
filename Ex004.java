package ex004;

import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFunc, horTrabalh;
        double salHor;
        
        numFunc = sc.nextInt();
        horTrabalh = sc.nextInt();
        salHor = sc.nextDouble();
        
        double salTotal = horTrabalh * salHor;
        
        System.out.println("Number = " + numFunc);
        System.out.printf("Salary = %.2f%n", salTotal);
       
        sc.close();
        
    }
    
}