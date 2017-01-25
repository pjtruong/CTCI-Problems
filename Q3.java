import java.lang.reflect.Array;
import java.util.Arrays;

public class Q3 {

	
	public static boolean isPermutation(String str1, String str2)
	{
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		System.out.println(array1);
		System.out.println(array2);
	
		
		return (Arrays.equals(array1, array2));
	}	
	
	
	public static void main(String[] args) {
		
		
		String input1 = "eat";
		String input2 = "tea";
		System.out.println(isPermutation(input1,input2));
		
		
	}

}
