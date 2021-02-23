package e.interfaces;

public class Nicole_MovableCircle implements Nicole_Movable{
	
	private int radius;
	private Nicole_MovablePoint center;
	
	public Nicole_MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new Nicole_MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
		
	}
	
	public String toString() {
		return "Radius= " + this.radius + "\nX= "+this.center.x + "\nY= " + this.center.y + "\n\n";
	}

	
	public void moveUp() {
		center.moveUp();		
	}

	
	public void moveDown() {
		center.moveDown();		
	}

	
	public void moveLeft() {
		center.moveLeft();		
	}

	
	public void moveRight() {
		center.moveRight();		
	}
}
