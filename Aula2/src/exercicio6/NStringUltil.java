package exercicio6;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;


public class NStringUltil extends StringUtils{

	public static String rpad (String s, char c, int n) {
		return s.substring(0,n) + c + s.substring(n+1,s.length());
	}
	public static String ltrim (String s) {
		String text = "";
		int i;
		for(i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				break;
			}
		}
		text = s.substring(i);
		return text;
	}
	public static String rtrim (String s) {
		String text = ""; 
		int i;
		for(i=s.length()-1;i>=0;i--) {
			if(s.charAt(i) != ' ') {
				break;
			}
		}
		text = s.substring(0,i);
				
		return text;
	}
	public static String trim(String s) {
		return StringUtils.trim(s);
	}
	public static int indexOfN (String s, char c, int n) {
		return StringUtils.indexOf(s,c,n);
	}
	
}
