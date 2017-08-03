package lang;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX() {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY() {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
