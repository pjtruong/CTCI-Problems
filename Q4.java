

public class Q4 {

	
	public static String fillSpace(String str)
	{
		int i = 0;
		int counter = 0;
		
		//get the length needed
		
		for(char c: str.toCharArray())
		{
			if(c == ' ')
			{
				counter = counter + 3;
			}
			
		}
		
		
		
		char [] stringArray = new char[str.length()+counter];
		
		
		
		
		for(char c: str.toCharArray())
		{
			if(c == ' ')
			{
				stringArray[i] = '%';
				stringArray[i+1] = '2';
				stringArray[i+2] = '0';
				i = i+3;
			}
			else
			{
				stringArray[i] = c;
				i++;
			}
			
		}
		
	
		String output = new String(stringArray);
		return output;
	}	
	
	
	public static void main(String[] args) {
		
		
			
			System.out.println(fillSpace("Mr John Smith Wagner Jr"));
		
		
	}

}
