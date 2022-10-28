package oct28Assg;
import java.time.LocalDate;
import java.util.*;
	public class Localdate {
	   public static void main(String[] args)
	    {
	     LocalDate today = LocalDate.now(); 
	     System.out.println("\n Current Date: "+today);
System.out.println("10 days after will be "+today.plusDays(10)+"\n");
	   }
	}