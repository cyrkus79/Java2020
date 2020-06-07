
public class Main 
{

	public static void main(String[] args) 
	{
//		Point point = new Point (5, 10);
//		System.out.println("x: " + point.x);
//		System.out.println("y: " + point.y);
//		
//		Point point2 = point;
//		
//		point2.x = 0;
//		point2.y = 20;
//		
//		System.out.println("x2: " + point2.x);
//		System.out.println("y2: " + point2.y);
//	
//		System.out.println("x: " + point.x);
//		System.out.println("y: " + point.y);
		
		Point point = new Point (10, 20);
		System.out.println("x: " + point.x);
		System.out.println("y: " + point.y);
		
		Point point2 = new Point(point);
		
		point2.y = 99;
		
		System.out.println("x2: " + point2.x);
		System.out.println("y2: " + point2.y);
	
		System.out.println("x: " + point.x);
		System.out.println("y: " + point.y);
	}
	

}
