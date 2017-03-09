
public class P1 {

	//three overloaded methods named Area, one for each shape, do theirmath accordingly
	public static double Area(double radius) {
		
		 return Math.PI * (radius * radius);
		 
		}
		
		public static double Area(double length, double width)
		{
			return length * width;
		}
		
		public static double Area(double radius, double height, String s)
		{
			return Math.PI * (Math.pow(radius, 2) * height);
		}
		
		
}
