public class RoomDimension {
 
    private double length;
    private double width;
     
    public RoomDimension()
    {
         
    }
     
    public RoomDimension(double l, double w)
    {
        length=l;
        width=w;
    }
     
    public double roomArea()
    {   
        double area;
        area=length*width;
        return area;        
         
    }
    public double getLength() {
        return length;
    }
 
    public double getWidth() {
        return width;
    }
     
}   
