package day6;

public class StringConcat {
	public static void main(String[] args) {
		
		String courseCode = "CS1001";
		String courseName = "Introduction to Computer";
		String splitChar ="-";
		
		//String Concatenation using + operator
		String concatWithPlus = courseCode+"-"+courseName;
		System.out.println("Course:"+concatWithPlus);
		
		//String Concatenation using inbuilt string method
		String courseWithMethod = courseCode.concat(splitChar).concat(courseName);
		System.out.println("Course:"+courseWithMethod);
		
	}

}
