
public class ChargeEdit {
	private static int[] account = new int[] {5658845, 8080152, 1005231, 4520125, 4562555, 6545231, 7895122, 5552012, 3852085, 8777541, 5050552, 7576651, 8451277, 7825877, 7881200, 1302850, 1250255, 4581002};
	
	
	public static int sequentialSearch(int value){
		int index,
			element;
		boolean found;
		
		index = 0;
		element = -1;
		found = false;
		
		while(!found && index < account.length){
			if (account[index] == value){
				found = true;
				element = index;
			}
			index++;
		}
			
	
		
		return element;
	}
}
