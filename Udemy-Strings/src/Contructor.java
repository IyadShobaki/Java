//String, StringBuffer, StringBuilder  8

//The important of constructors of string class
public class Contructor {

	public static void main(String[] args) {
		// String s = new String();  
		// String s = new String(String literal);
		// String s = new String(StringBuffer sb);
		// String s = new String(StringBuilder sb);
		//String s = new String(char[] ch);
		//String s = new String(byte[] b);
		
		char[] ch = {'j','a','v','a'};
		String s = new String(ch);
		System.out.println(s);
		
		byte[] b = {97,98,99,100};
		String s1 = new String(b);
		System.out.println(s1);

	}

}


