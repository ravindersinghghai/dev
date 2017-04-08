package com.pattern.test;

import com.pattern.abstractfactory.ComputerFactory;
import com.pattern.abstractfactory.PCFactory;
import com.pattern.abstractfactory.ServerFactory;
import com.pattern.model.Computer;

/**
 * Created by Geek on 7/4/17.
 */
public class TestDesignPatterns {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {

        // Program to interface
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","2.4 GHz","500 GB"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","2.9 GHz", "1 TB"));

        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
