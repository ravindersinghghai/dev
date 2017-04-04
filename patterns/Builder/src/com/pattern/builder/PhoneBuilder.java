package com.pattern.builder;

/**
 * Created by Geek on 4/4/17.
 */
public class PhoneBuilder {

    // You can have custom predefined default state as well instead of having NULL values.
    private String os = "Ios";
    private String ram = "GB";
    private String processor = "2.2 GH";
    private String screenSize = "17 inch";
    private String battery = "400 Mh";

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        // Simply copies the state of this phone builder object and puts it into new phone object.
        return new Phone(os, ram, processor, screenSize, battery);
    }

}
