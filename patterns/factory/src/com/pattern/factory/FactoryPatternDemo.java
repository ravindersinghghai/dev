package com.pattern.factory;

/**
 * Use the Factory to get object of concrete class by passing an information such as type.
 *
 * Created by Geek on 30/3/17.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw()
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Rectangle and call its draw()
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Get an object of Square and call its draw()
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }

}
