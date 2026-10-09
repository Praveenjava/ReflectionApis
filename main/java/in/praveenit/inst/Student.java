package in.praveenit.inst;

public class Student {

	String name;
	String email;
	long phno;
	static String institute;

	public static void main(String[] args) {

		Student.institute = "ashokit";

		Student ankit = new Student();
		ankit.name = "Ankit";
		System.out.println(ankit.name);

		Student goutham = new Student();
		goutham.name = "Goutham";
		System.out.println(goutham.name);
	}
}
