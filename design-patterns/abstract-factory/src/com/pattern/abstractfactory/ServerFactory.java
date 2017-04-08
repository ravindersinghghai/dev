package com.pattern.abstractfactory;

import com.pattern.model.Computer;
import com.pattern.model.Server;

/**
 * Created by Geek on 7/4/17.
 */
public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String cpu;
    private String hdd;

    public ServerFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, cpu, hdd);
    }
}
