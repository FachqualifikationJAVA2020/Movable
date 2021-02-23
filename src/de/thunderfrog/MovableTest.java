package de.thunderfrog;

public class MovableTest {
    public static void main(String[] args) {

        System.out.println("POINT:");
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        System.out.println();

        System.out.println("CIRCLE:");
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        System.out.println();

        System.out.println("RECTANGLE:");
        Movable m3 = new MovableRectangle(1, 2, 3, 4, 20,20);
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);

    }
}
