public class Point 
{
//	int x;
//	int y;
//	
//	Point (int x, int y)
//	{
//		this.x = x;
//		this.y = y;
//	}
	
	int x;
	int y;
	
	Point(Point p)
	{
		x = p.x;
		y = p.y;
	}
	Point (int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
