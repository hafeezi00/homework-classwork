package home_work;

public class StudntScore {

	public static void main(String[] args) {
	
		int score1 = 80;
		int score2 = 40;
		
		String name1 = "John";
		String name2 = "Mark";
		
		int passScore = 50;
		boolean result = false;
		char gender1='M';
		System.out.println("Name of Student1 "+name1);
		System.out.println("Name of Student2 "+name2);
		//logic
		result = score1 < passScore ;
		System.out.println("John"+result);
		System.out.println("Gender of student :"+gender1);
		//Average score
		int average;
		average=(score1+score2)/2;
		System.out.println("Average of Students"+average);
		
		
	}

}
