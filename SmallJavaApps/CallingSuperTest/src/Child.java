/**
 * Created by Geek on 15/3/17.
 */

class Parent {
    int x;

    public Parent() {
    }

    public Parent(int x) {
        this.x = x;
    }
}

public class Child extends Parent {

    public Child(int x) {
        super(101);
        this.x = 100;
    }

    public static void main(String args[]) {
        Child child = new Child(100);
        System.out.println(child.x);

    }

}
