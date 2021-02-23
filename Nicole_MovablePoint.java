package e.interfaces;

public class Nicole_MovablePoint implements Nicole_Movable {
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;
	
	public Nicole_MovablePoint(int nX , int nY , int xSpeed, int ySpeed) {
		this.x = nX;
		this.y = nY;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public String toString() {
		return "X = " + x + "\nY = "+ y + "\n\n";
	}

	@Override
	public void moveUp() {
		y -= ySpeed;	
	}

	@Override
	public void moveDown() {
		 y += ySpeed;	
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;	
	}

	@Override
	public void moveRight() {
		x += xSpeed;	
	}
}
