
package interviewquestions;


/*
 * 
 *Create a Calculator application that takes three inputs. The first argument is the Operation followed by two numbers.
  Output should be the result of the operation on those two numbers

  eg:
  c:\Calculator add, 5, 6
  11
  c:\Calculator subtract, 3, -1
  4

 * 
 */

// 

public class Calculator 

{  
	public int calculate (String operation , int firstInteger , int secondInteger)
	{
		
		
		if(operation.compareToIgnoreCase("add")==0)
		{
			return firstInteger + secondInteger;
		}
		
		else if (operation.compareToIgnoreCase("subtract")==0)
		{
			return firstInteger - secondInteger ;
		}
		
		return Integer.valueOf(null);
	
		
	}
	
	public static void main (String []args)
	{
		Calculator calculator = new Calculator();
		String operation = "add";
		int firstInteger = 4;
		int secondInteger= 4;
		System.out.println(calculator.calculate(operation, firstInteger, secondInteger));
	}
	
	
}