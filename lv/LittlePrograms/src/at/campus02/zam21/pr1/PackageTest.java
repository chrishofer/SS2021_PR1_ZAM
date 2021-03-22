package at.campus02.zam21.pr1;

import java.lang.Math;



public class PackageTest {
    public static void main(String[] args) {

        System.out.println(Math.random());

        int t = 1;
        System.out.println(t++); // post increment
        t = 1;
        System.out.println(++t); // pre increment
        int x = ++t;
        x = t++;
        t++; // macht keinen unterschied
        ++t; // is always the same
    }
}
