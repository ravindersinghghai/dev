/*
package com.company.ravinder;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");
    }
}
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    static {
        int B = 1;
        int H = 3;
        int AREA = 0;

        for (int i = 0; i <2; i++) {

            if (i == 1){
                B = -1;
                H = 2;
            }

            if (B <=0 | H <=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");

            } else {
                AREA = B * H;
                System.out.println(AREA);
            }
        }

    }

    public static void main(String[] args) {

    }
}