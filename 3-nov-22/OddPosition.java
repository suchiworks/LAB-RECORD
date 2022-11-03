package lab3Nov;

//the elements present on odd positions are a, c and e.

public class OddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = new int [] {5,6,7,8,9};   
System.out.println("Elements of given array present on "
		                               + "odd position: ");  

for (int i = 0; i < arr.length; i = i+2) {   
	            System.out.println(arr[i]);   
	       }
	}

}
