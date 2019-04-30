//String, StringBuffer, StringBuilder  9 + 10 

//The important of methods of string class
public class Methods {

	public static void main(String[] args) {
		
		String s = "durga";
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('g'));
		
		
		String s1 = "durga";
		s1 = s1.concat("software"); // you can use instead -> s1 = s1 + "software" or s1 += "software"  
		System.out.println(s1);
		
		String s2 = "DURGA";
		System.out.println(s2.equals("durga"));
		System.out.println(s2.equalsIgnoreCase("durga"));
		
		String s3 = "";
		System.out.println(s3.isEmpty());
		
		String s4 = "durga";
		System.out.println(s4.length());
		
		String s5 = "ababab";
		System.out.println(s5.replace('a', 'b'));
		
		String s6 = "abcdefg";
		System.out.println(s6.substring(3));
		System.out.println(s6.substring(3, 6));
		
		String s7 = "babbab";
		System.out.println(s7.indexOf('z')); // if not exist will be -1
		System.out.println(s7.indexOf('a')); // if exist more than once will be 1
		System.out.println(s7.lastIndexOf('a'));
		
		
		String s8 = "DuRga";
		System.out.println(s8.toLowerCase());
		System.out.println(s8.toUpperCase());
		
		// trim() method remove space in the beginning and in the end only,
		// but not from the middle
		String s9 = "DURGA SOFT";
		System.out.println(s9.length());
		System.out.println(s9.trim().length());
	}

}
