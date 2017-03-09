
public class P2 {
	private String desc;
	private int units;
	public P2(String desc, int units) {
		// TODO Auto-generated constructor stub
		this.desc = desc;
		this.units = units;
	}
	
	public P2(P2 object2) {
		// TODO Auto-generated constructor stub
		desc = object2.desc;
		units = object2.units;
	}

	public String toString(){
		String str = "Description: " + desc
				+ "\nUnits: " + units;
		
		return str;
	}
}
