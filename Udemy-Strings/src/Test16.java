//16 + 17 + 18 + 19 + 20
public class Test16 {

	public static void main(String[] args) {
		
//		String ta = "A";
//		ta = ta.concat("B");
//		String tb = "C";
//		ta = ta.concat(tb);
//		ta.replace('C', 'D');
//		ta = ta.concat(tb);
//		System.out.println(ta);  // ans ABCC
//		
//		String str = " ";
//		str.trim();
//		System.out.println(str.equals("") + " " + str.isEmpty()); // false false
//		
//		
//		String s = "DURGA SOFT";
//		int len = s.trim().length(); // trim() remove blank from far left or far right side, not the middle
//		System.out.println(len); // 10
//		
//		
//		String s1 = "Hello World";
//		s1.trim();
//		int i1 = s1.indexOf(" ");
//		System.out.println(i1); // 5
		
		
		String s2 = "Java";
		String s3 = new String ("java");
		
//		String s4 = s3;
//		if (s2 == s4)    // not equal
		
//		if(s2.equalsIgnoreCase(s3))   // equal
		
//		String s4 = s3;
//		if(s2.equals(s4))   // Not equal
		
		if(s2.toLowerCase() == s3.toLowerCase()) // Not equal 
	 	{
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
	}

}
