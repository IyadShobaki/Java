//String, StringBuffer, StringBuilder  13
public class Immutability {

	public static void main(String[] args) {
		String s1 = new String ("durga"); // created in the heap area with a copy in SCP area
		String s2 = s1.toUpperCase(); // create anothor object in the heap area only
		String s3 = s1.toLowerCase(); // the content for the first object doesn't change s3 will point to same object
		System.out.println(s1==s2);// false
		System.out.println(s1==s3);// true
		
		
		String ss1  = "durga"; // create object in SCP area only
		String ss2 = ss1.toString(); // use same object in SCP area ( content doesn't change)
		String ss3 = ss1.toLowerCase(); // use same object in SCP area
		String ss4 = ss1.toUpperCase(); // new object in the heap area
		System.out.println(ss1 == ss2);//true
		System.out.println(ss1 == ss3);//true
		System.out.println(ss1 == ss4);//false
		
	}

}
