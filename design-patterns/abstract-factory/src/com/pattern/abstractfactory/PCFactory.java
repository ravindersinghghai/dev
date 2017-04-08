package com.pattern.abstractfactory;

import com.pattern.model.Computer;
import com.pattern.model.PC;

/**
 * Created by Geek on 7/4/17.
 */
public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String cpu;
    private String hdd;

    public PCFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, cpu, hdd);
    }
}
