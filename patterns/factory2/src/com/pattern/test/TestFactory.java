package com.pattern.test;

import com.pattern.model.PC;
import com.pattern.model.Computer;

/**
 * Created by Geek on 31/3/17.
 */
public class TestFactory {

    public static void main(String[] args) {

        // Program to Interfaces / Abstract class instead of concrete class types
        Computer computerPC = new PC("8 GB", "2.2 GHz", "500");
        Computer computerServer = new PC("16 GB", "3.2 GHz", "1 TB");

        System.out.println("Factory PC config: " + computerPC.toString());
        System.out.println("Factory Server config: " + computerServer.toString());

    }

}
