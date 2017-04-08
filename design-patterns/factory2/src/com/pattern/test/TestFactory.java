package com.pattern.test;

import com.pattern.factory.ComputerFactory;
import com.pattern.model.PC;
import com.pattern.model.Computer;

/**
 * Created by Geek on 31/3/17.
 */
public class TestFactory {

    public static void main(String[] args) {

        // Program to Interface or Abstract class instead of concrete class types
        Computer computerPC = ComputerFactory.getComputer("PC", "8 GB", "2.2 GHz", "500" );
        Computer computerServer = ComputerFactory.getComputer("Server", "16 GB", "3.2 GHz", "1 TB");

        System.out.println("Factory PC config: " + computerPC.toString());
        System.out.println("Factory Server config: " + computerServer.toString());

    }

}
