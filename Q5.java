
import java.util.Arrays;


public class Q5 {
	
	public static String compressWord(String str)
	{
		
		
		char[] array = str.toCharArray(); 
		Arrays.sort(array);
		String sortedStr = new String(array); //create a sorted string of input
		char[] newArray = new char[str.length()]; //create a new array to hold the compressed data
		
		int counter = 0; //counter the number of repetitive letter
		int i = 0;  //array slot counter
		
	
		
		for(int c=0; c<array.length; c++)
		{
			
		
			if(sortedStr.indexOf(array[c]) != sortedStr.lastIndexOf(array[c]))
			{
				counter = (sortedStr.lastIndexOf(array[c]) - sortedStr.indexOf(array[c])) + 1;
				newArray[i] = array[c];
				newArray[i+1] = Integer.toString(counter).charAt(0);
			
				i = i+2;
				c = (c + counter) -1;
						
			}
			else
			{
				
				newArray[i] = array[c];
				i++;
			}
			
		}
		
		
		
		String compressedStr = new String(newArray);
		
		return compressedStr;
		
		
		
	}	
	
	
	public static void main(String[] args) {
		
		
			
			System.out.println(compressWord("aabcccaa"));
		
		
	}

}
