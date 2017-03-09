public class RoomCarpet {
    private RoomDimension copy;
    private double cost;
     
     
    public RoomCarpet()
    {
         
    }
     
    public RoomCarpet(RoomDimension copy, double c)
    {
    	this.copy = copy;
        cost=c;
    }
     
    public double calculate()
    {   
        double totalCost;
         
        totalCost=cost*copy.roomArea(); 
        return totalCost;
    }
}