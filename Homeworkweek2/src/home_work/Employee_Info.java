package home_work;

public class Employee_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		emp_class ec1 = new emp_class(121,"bob");
		int ei = ec1.empid;
		String en = ec1.empname;
		System.out.println("print emp id"+ ei );
		System.out.println("print emp name"+ en);
	}

}
