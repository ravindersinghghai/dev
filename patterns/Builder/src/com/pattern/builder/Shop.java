package com.pattern.builder;

/**
 * Created by Geek on 4/4/17.
 */
public class Shop {

    public static void main(String[] args) {

        Phone phone = new PhoneBuilder().setOs("Android").setProcessor("2.4Gh").setRam("16GB").getPhone();
        System.out.println("My custom phone specs are: " + phone);
    }

}
