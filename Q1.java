
public class Q1 {

	
	public static boolean isUniqueChars(String str)
	{
		boolean isUnique = false;
		
		if(str.length()>128)  //assuming string is ASCII non extended
		{
			return false;
		}
		
		
		for(char c : str.toCharArray())
		{
			
			if (str.indexOf(c) != str.lastIndexOf(c))
			{
				
				return false;     //end the loop once the character appears more than once
			}
			else
				isUnique =  true;
			
		}
		
		
		return isUnique;
		
	}
	
	
	public static void main(String[] args) {
		
		char[] array = new char[128];
		String str = "test";
		str.toCharArray();
		String input = "t12";
		System.out.println("Is the input word unique? " + input + " " + isUniqueChars(input));
		
	}

}
