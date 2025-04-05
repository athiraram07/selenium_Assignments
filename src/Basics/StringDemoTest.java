package Basics;

public class StringDemoTest {

	public static void main(String[] args) {
		/*String msg = "hello";
		System.out.println(msg);
		msg = msg.concat(" world");
		System.out.println(msg);*/
		
		
		//assignment 1 
		//"we are leaning java "
		// find length of the string
     	// print each character in the string using for loop 
		
		String text = "we are learning java";
		int L = text.length();  // here length is the string method 
		System.out.println ("length of the string is: " + L);
		
		for(int i = 0; i< L; i++)
		{
			System.out.println (text.charAt(i));  // here charAt is a string method
			
		
		}
		
		//assignment 2 
		// explore with methods endsWith , indexOf , lastIndexOf , charAt , split , reverse of the string using for loop
		
	}

}
