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
public class relationalop {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }

}
