package lab10Nov;

public class Duplicate {
	public static void main(String[] args)   
    {
   String str = "Anudip Foundation Skill & career development centre.";
   String str1 = "Famous ";
        System.out.println("the new  string is: " + str);
        System.out.println("the given  string is: " + str1);
        char arr[] = new char[str.length()];
        char[] mask = new char[256];
        for (int i = 0;i<str1.length(); i++)
        	mask[str1.charAt(i)]++;
        System.out.println("the new  string is:");
		for(int i = 0; i<str.length(); i++)
		if (mask[str.charAt(i)] ==0)
        	System.out.print(str.charAt(i));
    }   

}
