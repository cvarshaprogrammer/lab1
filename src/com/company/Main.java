
package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        int radius;
        double pi,area;
        pi=3.14;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER RADIUS:  ");
        radius=in.nextInt();
        area=pi*radius*radius;
        System.out.println(" RADIUS is :  "+ radius);
        System.out.println(" AREA is :  " + area);

    }
}
