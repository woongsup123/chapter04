package lang;

public class PointTest {
	
	public static void main (String[] args) {
		Point point = new Point();
		System.out.println( point.getClass().getName() );
		System.out.println( point.hashCode() );
		System.out.println( point.toString() );
		System.out.println( point );
		
		System.out.println("=====================");
		
		String s = new String( "hello" );
		System.out.println( s.getClass().getName() );
		System.out.println( s.hashCode() );
		System.out.println( s.toString() );
		System.out.println( s );
	}
}
