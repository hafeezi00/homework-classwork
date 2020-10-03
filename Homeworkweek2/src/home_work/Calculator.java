package home_work;

public class Calculator {
	int num1=10;
	int num2=6;
	int result;
	
	
	Calculator(int num1,int num2)
	{
	this.num1  = num1;
	this.num2  = num2;
	}
	
	
	public void addition()
	{ 
		//logic
		result = num1+num2;
	}
	public void substraction()
	{ 
		result = num1-num2;
	}
	public int multiplication()
	{ 
		result = num1*num2;
		return result;
		
	}
	public void division()
	{ 
		result = num1/num2;
	}
	
}
