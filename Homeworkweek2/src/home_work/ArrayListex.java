package home_work;

import java.util.ArrayList;

public class ArrayListex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> StudentScores= new ArrayList<Integer>();
		StudentScores.add (99);
		StudentScores.add (88);
		StudentScores.add (97);
		StudentScores.add (66);
		StudentScores.add(77);
		StudentScores.add(95);
		
System.out.println(StudentScores.get(0));
System.out.println(StudentScores.get(1));
System.out.println(StudentScores.get(2));
System.out.println(StudentScores.get(3));
System.out.println(StudentScores.get(4));
System.out.println(StudentScores.get(5));
for(int i=0;i<StudentScores.size();i++) 
{
	System.out.println(StudentScores.get(i));
	
	}

	}

}
