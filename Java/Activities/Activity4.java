package activities;

public class Activity4 {

	public static void main(String[] args) {

        int arr[] = { 4,3,2,10,12,1,5,6 };
        

    	InsertionSortCode sortnumbers = new InsertionSortCode();
    	sortnumbers.sort(arr);
    	 
    	sortnumbers.printArray(arr);

	}
	

}
