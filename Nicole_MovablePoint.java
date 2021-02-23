package e.interfaces;

public class Nicole_MovablePoint implements Nicole_Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public Nicole_MovablePoint(int x , int y , int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
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

