package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Geek on 24/11/16.
 */

public class TestClass {

    public static void main (String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println("car name = " + user.getCar().getName() + " | " + "Per day cost = " + user.getCar().getPerDayCost());

    }
}
