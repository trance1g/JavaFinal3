
public class Landtract {
	//private variables for the length width and area
	private double length;
	private double width;
	private double Area;
	public Landtract() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @return the area
	 */
	public double getArea() {
		return length * width;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		Area = area;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Landtract [length=" + length + ", width=" + width + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Landtract other = (Landtract) obj;
		if (Double.doubleToLongBits(Area) != Double.doubleToLongBits(other.Area))
			return false;
		return true;
	}
	
}
