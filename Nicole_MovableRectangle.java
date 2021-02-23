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
		this.topLeft.y -= this.topLeft.ySpeed;
		this.bottomRight.y -= this.bottomRight.ySpeed;
	}
	
	@Override
	public void moveDown() {
		this.topLeft.y += this.topLeft.ySpeed;
		this.bottomRight.y += this.bottomRight.ySpeed;
	}
	
	@Override
	public void moveLeft() {
		this.topLeft.x -= this.topLeft.xSpeed;
		this.bottomRight.x -= this.bottomRight.xSpeed;
	}
	
	@Override
	public void moveRight() {
		this.topLeft.x += this.topLeft.xSpeed;
		this.bottomRight.x += this.bottomRight.xSpeed;
	}
	
	public String toString() {
		return "MovableRectangle = topLeft: " + this.topLeft + "\nbottomRight: " + this.bottomRight + "\n\n";
	}
}
