//2. write a program to calculate and display area of circle using given height & base

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        
        Scanner calc = new Scanner(System.in);

        System.out.print("Enter Value Of height Radius : ");
        int r = calc.nextInt();
        
        double carea = 3.14*(r*r);
        
        System.out.print("\nArea of circle Is : ");
        System.out.println(carea);
    }
}
