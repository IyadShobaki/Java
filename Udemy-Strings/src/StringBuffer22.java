// 22 + 23 + 24
public class StringBuffer22 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // 16
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity()); // 16
		sb.append("q"); // add new character to be 17
		System.out.println(sb.capacity()); // 34
		sb.append("abcdefghijklmnopq"); // add 17
		System.out.println(sb.capacity()); // 34
		sb.append("r");
		System.out.println(sb.capacity()); // 70
		
		// Create a SB with specific capacity
		StringBuffer sb1 = new StringBuffer(1000);
		System.out.println(sb1.capacity()); // 1000
		
		// create SB with String argumant
		// capacity = String length + 16
		StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(sb2.capacity());// 21
		// class #24
 		System.out.println(sb2.charAt(3));
 		//System.out.println(sb2.charAt(30));// out of bounds exception
 		
 		sb2.setCharAt(0, 'D'); // replace charachters
 		System.out.println(sb2);
 		
 		StringBuffer sb3 = new StringBuffer();
 		sb3.append("PI value is ");
 		sb3.append(3.14);
 		sb3.append(" it is exactly ");
 		sb3.append(true);
 		System.out.println(sb3);
 		
 		StringBuffer sb4 = new StringBuffer("abcdefgh");
 		sb4.insert(2,"xyz");
 		System.out.println(sb4);
 		sb4.delete(2, 5);
 		System.out.println(sb4);
 		sb4.deleteCharAt(3);
 		System.out.println(sb4);
 		sb4.reverse();
 		System.out.println(sb4);
 		
 		
 		
 		StringBuffer sb5 = new StringBuffer("abcdefghijk");
 		sb5.setLength(8);
 		System.out.println(sb5);
 		
 		StringBuffer sb6 = new StringBuffer();
 		System.out.println(sb6.capacity());
 		sb6.ensureCapacity(1000);
 		System.out.println(sb6.capacity());
 		
 		
 		StringBuffer sb7 = new StringBuffer(1000);
 		sb7.append("ABC");
 		System.out.println(sb7.capacity());
 		sb7.trimToSize();
 		System.out.println(sb7.capacity());
	}

}
