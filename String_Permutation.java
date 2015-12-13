/**
 * 
 */
package ctci_progs;
import java.util.*;

//************************************************************************
//Program to compare if the given strings are the permutation of the other
//************************************************************************
/**
 * @author Aruna
 *
 */
public class String_Permutation {

	/**
	 * @param args
	 * @return 
	 */
	
	public static String sort(String s)
	{
		char[] charcontent = s.toCharArray();
		java.util.Arrays.sort(charcontent);
		return new String(charcontent);
				
	}
	public static boolean permutation(String s,String t)
	{
		if(s.length()!=t.length())
		{
		return false;
		}
		else
		{
			return sort(s).equals(sort(t));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="madam";
		String str2="madam";
		System.out.println("Permutation of the given strings are:" + permutation(str1,str2));
		permutation(str1,str2);
		
		
	}

}
