/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package start;
import java.util.*;
import java.io.*;
import java.lang.System;


/**
 *
 * @author Admin
 */
public class logicalop {
    public static void main(String[] args) {


        int a,b,c,d;
        System.out.println ("enter four numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println(a>b && c>d);
        System.out.println(a>b || c>d);
        System.out.println(!(a>b));

    }

}
