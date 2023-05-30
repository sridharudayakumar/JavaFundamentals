package day6;

public class StringEmpty {

	public static void main(String[] args) {
		
		//String can be either null or empty 
		
		/*An empty string is a String object with an assigned value, 
		   but its length is equal to zero.*/
		//A null string has no value at all.
		String nullString = null;
		String emptyString = "";
		
		if(nullString==null)
		{
			System.out.println("String is null");
		}
		if(emptyString.isEmpty())
		{
			System.out.println("String is empty");
		}
		

	}

}
