
public class Charge {
	//new array for the account numbers
	private static int[] account = new int[] {5658845, 8080152, 1005231, 4520125, 4562555, 6545231, 7895122, 5552012, 3852085, 8777541, 5050552, 7576651, 8451277, 7825877, 7881200, 1302850, 1250255, 4581002};
	
	
	public static int sequentialSearch(int value){
		//new variables used to search for the input
		int index,
			element;
		boolean found;
		
		//initializing the variables so they can be used
		index = 0;
		element = -1;
		found = false;
		
		//while loop that determines if the number macthes any from the array
		while(!found && index < account.length){
			if (account[index] == value){
				found = true;
				element = index;
			}
			index++;
		}
			
	
		//return the element
		return element;
	}
}
