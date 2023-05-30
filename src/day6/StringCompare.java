package day6;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String name1 = "Sridhar";
		String name2 = "sridhar";
				
		//Note: (==) operator compare the reference not the value
		System.out.println("Comparing strings using (==):"+(name1==name2));
		
		//Note: .equals() compare the values stored in string object 
		System.out.println("Comparing String using equals() method:"+ name1.equals(name2));
		
		System.out.println("Comparing String using equalsIgnoreCase() method:"+ name1.equalsIgnoreCase(name2));
		
	}

}
