package ex003;

import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        int numD = sc.nextInt();
        
        System.out.println("DIFERENCA = " + (numA * numB - numC * numD));
        
        sc.close();
    }
}
