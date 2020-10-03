package home_work;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayListEx2 result = new  ArrayListEx2(); 	
		boolean var =  result.make10(9, 10);
		System.out.println("print result"+ result);
		
		
		
	}
public boolean make10(int a,int b)
{
	if(a ==10 || b==10  ||  (a+b)==10)
	
	{
	 return true;
	 }
	 else
	 {
	 return  false;
	 }
}
}

