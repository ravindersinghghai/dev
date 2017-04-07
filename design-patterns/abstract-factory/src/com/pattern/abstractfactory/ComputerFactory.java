package com.pattern.abstractfactory;

import com.pattern.model.Computer;

/**
 * Created by Geek on 7/4/17.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
