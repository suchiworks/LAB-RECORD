package lab8thDec;
import java.util.ArrayList;
import java.util.List;
//Write a Java program to extract a portion of an array list.
public class ExtractArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List < String > clr = new ArrayList < String > ();
		    clr.add("RED");
		    clr.add("GREEN");
		    clr.add("ORANGE");
		    clr.add("WHITE");
		    clr.add("BLACK");
            System.out.println("Original one: "+clr);
		    // new one
		    List<String>s1 = clr.subList(0, 3);
		    System.out.println("New List one: " + s1);
		  }}

output:
Original one: [RED, GREEN, ORANGE, WHITE, BLACK]
New List one: [RED, GREEN, ORANGE]
