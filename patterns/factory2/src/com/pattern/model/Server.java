package com.pattern.model;

/**
 * Created by Geek on 31/3/17.
 */
public class Server extends Computer {

    private String ram;
    private String cpu;
    private String hdd;

    public Server(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return null;
    }

    @Override
    public String getCPU() {
        return null;
    }

    @Override
    public String getHDD() {
        return null;
    }
}
