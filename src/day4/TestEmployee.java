package day4;

public class TestEmployee {

	public static void main(String[] args) {
		//Creating Employee object
		Employee employee = new Employee();
		
		//Accessing Employee members
		employee.setEmployeeId(101);
		employee.setEmployeeName("Jaswant");
		employee.setAge(21);
		
		System.out.println("Employee Id:"+ employee.getEmployeeId());
		System.out.println("Employee Name:"+employee.getEmployeeName());
		System.out.println("Employee Age:"+ employee.getAge());

	}

}
