//3. write a program to convert farenheit into celilcious

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        
        Scanner celi = new Scanner(System.in);

        System.out.print("Enter Value Of Farenheit : ");
        float f = celi.nextFloat();
        
        float celilcious = ((f-32)*5)/9;
        
        System.out.print("\nFarenheit Into Celilcious Is : ");
        System.out.println(celilcious);
    }
}
