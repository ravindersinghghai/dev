package com.company.ravinder;

import java.util.List;
import java.util.ArrayList;

import java.util.*;
import java.io.*;
import java.text.*;

/**
 * Created by Geek on 17/2/17.
 */
//public class TestGenerics {

  //  public static void main (String args []) {


        /*
        System.out.println("Hello Generics!");

        // test generic declararions and assignments

        // this is OK.
        List<String> list1 = new ArrayList<String>();

        // this is NOT allowed -> Custom object types
        List<Animal> list2 = new ArrayList<Dog>();

        // this declaration however is OK
        List<Animal> list3 = new ArrayList<Animal>();

        // let's check these assignment
        List<List> list4 = new ArrayList<>();
        List<RuntimeException> runtimeExceptionsList = new ArrayList<NullPointerException>();
    */
import java.util.*;
import java.io.*;
import java.net.*;

class Brain {
    Brain(int a, int b) {
        int c = a + b;
        System.out.println("Sum=" + c);
    }
    void display() {
        System.out.println("Statement");
    }
}
class Bench extends Brain {
    Bench(int a, int b) {
        int c = a - b;
        System.out.println("Difference=" + c);
    }
}
public class Thread {
    public static void main(String args[]) {

        //InetAddress ip =System.resolveHostByName("www.example.com");
        //InetAddress ip =Socket.DNSLookup("www.example.com");
        //InetAddress ip =InetAddress("www.example.com");
        InetAddress ip =InetAddress.getByName("www.example.com");
        String ip =InetAddress.DNSLookup("www.example.com");
        System.out.println(ip);

    }
}





