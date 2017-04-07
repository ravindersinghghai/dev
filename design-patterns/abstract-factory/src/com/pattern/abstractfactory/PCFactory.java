package com.pattern.abstractfactory;

import com.pattern.model.Computer;
import com.pattern.model.PC;

/**
 * Created by Geek on 7/4/17.
 */
public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, cpu, hdd);
    }
}
