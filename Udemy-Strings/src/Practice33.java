class MyString
{
	String msg;
	MyString(String msg){
		this.msg = msg;
	}
//	public String toString() {
//		return msg;
//	}
}

public class Practice33 {
	
//	public String toString() {
//		return "Practice33 Object";
//	}
	public static void main(String[] args) {
	
		Practice33 p1 = new Practice33();
		System.out.println(p1); // internally toString() method will be called
		System.out.println(p1.toString()); // if we don't need hashcode to return, we need to overload toString method
		
		System.out.println("Hello"+ new StringBuilder(" Java SE 8"));
		System.out.println("Hello" + new MyString(" Java SE 8"));
	}

}
