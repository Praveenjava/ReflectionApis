package in.praveenit.inst;

public class Employee {
	
	int age;
	String name;
	double phno;
	static String Designation;
	
	public static void main(String[] args) {
		Employee.Designation = "Java";
		
		Employee e = new Employee();
		//e.age = 18;
		//e.name = "Praveen";
		
		//Employee e1 = new Employee();
		//e1.age;
		
		//System.out.println(e1.age);
				
		
		System.out.println(e.name);
		
	}

}
