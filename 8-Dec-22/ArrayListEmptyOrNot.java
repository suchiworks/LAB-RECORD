package lab8thDec;
//Write a Java program to test an array list is empty or not.
import java.util.ArrayList;

public class ArrayListEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> clr= new ArrayList<String>();
        clr.add("Red");
        clr.add("Green");
        clr.add("Black");
        clr.add("White");
        clr.add("Pink");
        System.out.println("Original one: " + clr);
        clr.remove(clr);
		//System.out.println(clr);
		System.out.println("Size is : "+clr.isEmpty());//size()
		//System.out.println("Empty"+clr);
	}

}
