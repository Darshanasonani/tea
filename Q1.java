//1. write a program to calculate and display area of triangle using given height & base


import java.util.*;

public class Q1 {
     public static void main(String[] args) {
        
        Scanner calca = new Scanner(System.in);

        System.out.print("Enter Value Of height : ");
        int h = calca.nextInt();
        
        System.out.print("\nEnter Value Of base : ");
        int b = calca.nextInt();
        
        int carea = h*b/2;
        
        System.out.print("\nArea of triangle Is : ");
        System.out.println(carea);
    }
}
