package de.thunderfrog;

public class MovableCircle implements Movable{

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;

    }

    public String toString() {
        return "radius= "+this.radius+" x= "+this.center.x+" y= "+this.center.y;
    }


    public void moveUp() {
        center.y -= center.ySpeed;

    }


    public void moveDown() {
        center.y += center.ySpeed;

    }


    public void moveLeft() {
        center.x -= center.xSpeed;

    }


    public void moveRight() {
        center.x += center.xSpeed;

    }

}
