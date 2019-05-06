// Method Chaining
public class StringBuilder27 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("durga").append(" Solution").reverse().insert(2, "xyz").delete(3, 7);
		System.out.println(sb);

	}

}
