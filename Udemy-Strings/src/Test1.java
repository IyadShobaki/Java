//String, StringBuffer, StringBuilder  15
//final vs immutability
class Test1 {

	public static void main(String[] args) {
		
		final StringBuffer  sb = new StringBuffer("durga");// by make it final it will not change the content by creating a new object
		sb.append("software");
		System.out.println(sb);
		//sb = new StringBuffer("ravi"); remove final if you want this to excecute
		//System.out.println(sb);

	}

}

