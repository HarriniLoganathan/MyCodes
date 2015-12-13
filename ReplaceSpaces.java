/**
 * 
 */

package ctci_progs;
import java.io.*;
import java.lang.*;

/**
 * @author Aruna
 *
 */
public class ReplaceSpaces {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Str = new String();
Str = "string with space";
System.out.println(Str);
String Str1 = Str.replace(' ','0');
System.out.println(Str1);

/*StringBuilder sb1 = new StringBuilder();
char[] StrChar = Str1.toCharArray();
for(int i=0;i<=Str1.length();i++){
	if(StrChar[i]==' ')
	{
		String sb2 = StrChar.toString();
		
		sb2.append("%20");
	}
}
System.out.println("finaloutput"+StrChar);

*/

	
	}

}
