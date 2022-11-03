package lab3Nov;

//Write a Java program to find the duplicate values of an array of integer values.


public class DuplicateValue {
		public static void main(String[] args) 
	    {
	        int[] a = {5,2,7,7,5};	 
	    for (int i = 0; i < a.length-1; i++)	        
	        for (int j = i+1; j < a.length; j++) {{
	            
                 if ((a[i] ==a[j]) && (i != j)) {        
 System.out.println("Duplicate Element : "+a[j]);
	       }}}}}
	
