package lab8thDec;
import java.util.*;
//Write a Java program to update specific array element by given element.
public class UpdateSpecificArrayElement {
	public static void main(String[] args) {//MAIN METHOD
		// TODO Auto-generated method stub
		  List<String> clr = new ArrayList<String>();
		  clr.add("Red");    //0
		  clr.add("Green");   //1
		  clr.add("Orange");  //2 into YELLOW
		  clr.add("White");   //3
		  clr.add("Black");   //4
		  // Print all
		  System.out.println(clr);
		  // Updated element"Yellow"
		  clr.set(2, "Yellow");
		  System.out.println(clr);
	}}
output:
[Red, Green, Orange, White, Black]
[Red, Green, Yellow, White, Black]
