package e.interfaces;

public class Nicole_MovableTest {
	public static void main(String[] args) {
		Nicole_Movable m1 = new Nicole_MovablePoint(5, 6, 10, 15);     // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		   
		Nicole_Movable m2 = new Nicole_MovableCircle(1, 2, 3, 4, 20);  // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
	}
}
