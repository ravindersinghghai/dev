package com.pattern.factory;

import com.pattern.model.Computer;
import com.pattern.model.PC;
import com.pattern.model.Server;

/**
 * Created by Geek on 31/3/17.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String cpu, String hdd) {

        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, cpu, hdd);

        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, cpu, hdd);
        }

        return null;
    }
}
