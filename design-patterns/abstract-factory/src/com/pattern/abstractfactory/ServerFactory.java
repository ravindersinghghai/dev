package com.pattern.abstractfactory;

import com.pattern.model.Computer;
import com.pattern.model.Server;

/**
 * Created by Geek on 7/4/17.
 */
public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, cpu, hdd);
    }
}
