package lab3Nov;

//Write a Java program to test if an array contains a specific value.

public class SpecificValue {
		
		   public static void main(String[] args) {
	int[] arr ={1789, 2035, 1899, 1456, 2013};
		      System.out.println(contains(arr, 2013));
		   }
		   
public static boolean contains(int[] arr, int item) {
			      for (int n : arr) {
			      if (item == n) {
			            return true;
			         }}
			            return false;
			   }
}
