package e.interfaces;

public class Nicole_MovableRectangle implements Nicole_Movable {
	private Nicole_MovablePoint topLeft;
	private Nicole_MovablePoint bottomRight;
	
	public Nicole_MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new Nicole_MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new Nicole_MovablePoint(x2, y2, xSpeed, ySpeed);
	}
	
	@Override
	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
	}
	
	@Override
	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
	}
	
	@Override
	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
	}
	
	@Override
	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
	}
	
	public String toString() {
		return "MovableRectangle topLeft: " + this.topLeft + "\nMovableRectangle bottomRight: " + this.bottomRight + "\n\n";
	}
}
