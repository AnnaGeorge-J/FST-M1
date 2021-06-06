package activities;

import java.sql.Array;

public class Activity2 {
	 static int sum =0;

	public static void main(String[] args) {
		
		int a[] = new int[6];
		a[0] = 10;
		a[1] = 77;
		a[2] = 10;
		a[3] = 54;
		a[4] = -11;
		a[5] = 10;
		int length = a.length;
		 System.out.println(length);
		 for (int i=0; i<length; i++){
			 int numtoadd = a[i];
			 if(numtoadd ==10){
			  sum = numtoadd+sum;
			  			 }
		 }
		 System.out.println(sum);

}
}
