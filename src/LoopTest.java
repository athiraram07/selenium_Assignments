
public class LoopTest {

	public static void main(String[] args) {
		System.out.println("athira");
		System.out.println(1);
		System.out.println("hello");
		
      //voting

		//if age is more than 18 pring allowed to vote
		//if age is less than 18 print not allowed to vote
		
		short age1 = 23;
		
		if (age1>25) //( conditoons rules either true or false )  
		{
		  System.out.println ("allowed to vote");
		}
		
		else
		{	
		System.out.println ("not allowed to vote");
		}
		
//if statement 		
		
		
		//voting 
				//if age is more than 18, print allowed to vote
				//if age is less than 18, print not allowed vote
				short age = 23;
				
				//OR =- || - condition 1 OR condition 2 is TRUE
				//AND =- && - condition 1 AND condition 2 both should be true than only it will 
				//process the if body
				
				boolean voted = true;
				if(age>=18 && voted==true)//AND //conditions results me in either true/false //if(false)
				{//body of if statement
					System.out.println("I am in a IF Block");
					System.out.println("Allowed to vote");
				}else {
				System.out.println("Not allowed to vote");
				}
				
				//Grading systtem
				//if percentage >= 90% -- print > First GRADE
				//if percentage >=75% and <90% - Second Grade
				//if percentage >= 60 and <75 - Third Grade
				//else fail
				
				byte percentage = 74;
				if(percentage >= 90)
				{
					System.out.println("First Grade");
				}else if(percentage >=75 && percentage<90)
				{
					System.out.println("Second Grade");
				}else if(percentage >=60 && percentage<75)
				{
					System.out.println("Third Grade");
				}else 
				{
					System.out.println("Fail");
				}
				
				
				//print day names based on the day number
				//if day = 1 -- print Sunday
				//if day - 2 -- print MOnday..
				
				//Switch
				byte day = 2;
				switch(day)
				{
				case 1: 
					System.out.println("Sunday");
					break;
				case 2:
					System.out.println("Monday");
					break;
				case 3:
					System.out.println("Tuesday");
					break;
				case 4:
					System.out.println("Wednesday");
					break;
				case 5:
					System.out.println("Thursday");
					break;
				case 6:
					System.out.println("Friday");
					break;
				case 7:
					System.out.println("Saturday");
					break;
				default:
				{
					System.out.println("POlease enter value from 1 to 7");
				}
			}
				//Assignment - all calendar months in the year
				//switch cases and if else
				
				/*System.out.println("Hemant");
				System.out.println("Gandhi");
				System.out.println("Hemant");
				System.out.println("Gandhi");
				System.out.println("Hemant");
				System.out.println("Hemant");*/
				
				//how to use a for loop
				for(int i=1; i<=10; i++)
				{
					//i++ means 1+1 = 2
					System.out.println("Hemant");
				}
				
				/*for(;;)
				{
					
				}*/
				
				/*for(int i=1; i<=10;)
				{
					//i++ means 1+1 = 2
					System.out.println("Hemant");
				}
				
				for(int i=1; ;i++)
				{
					//i++ means 1+1 = 2
					System.out.println("Journey To Automation");
				}*/
				//for(assignment;conditional(true/false);increment/decrement)

				for(int i = 10;i>=1;i--)
				{
					System.out.println("THe table is "+i);
				}
				
			}

		}		
		
		
	}

}
