
public class Practice30 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder ();
		String s = "";
		if (sb.equals(s))
		{
			System.out.println("Match1");
		}else if (sb.toString().equals(s.toString()))
		{
			System.out.println("Match2");
		}else {
			System.out.println("No Match");
		}
		
		
		StringBuilder sb1 = new StringBuilder("Durga");
		String str1 = sb1.toString();
		//chose one of the correct line of the next lines
		 String str2 = str1;   // (True)
		// String str2 = new String(str1); // False, because different objects created 
		// String str2 = sb1.toString(); // False, new object created
		//  String str2 = "Durga"; // False, because new object will created in SCP area
		
		System.out.println(str1 == str2);
		
		System.out.println(sb1.length());
		sb1.delete(0, sb1.length()); // this will delete sb1
		System.out.println(sb1.length());
	}

}
