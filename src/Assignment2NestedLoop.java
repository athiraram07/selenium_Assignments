
public class Assignment2NestedLoop {

	public static void main(String[] args) {
		//if nested
		
		int i = 0 ;
		
		do
		{ 
			System.out.println("do while loop iteration:" +(i+1));
			if(i % 2 ==0)
				
			   {
				System.out.println(i+ "is an even number");
			
			   }
			else
			{
				System.out.println(i+ "is an odd number");
				
			}
			i++;
		}
		while (i<5);
		
		System.out.println("---");
		
		//for nested
		
		for (int j=0;j<5;j++)
		{
			System.out.println ("for loop iteration: "+(j+1));
			
			if (j % 2 == 0)
			{
				System.out.println(j+ "is an even number");
				
			}
			else
			{
				System.out.println(j+ "is an odd number");
			
			} 
		}
	}

}
