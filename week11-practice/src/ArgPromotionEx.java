
public class ArgPromotionEx {

	public static void main(String[] args) {
		
		System.out.println("The max is " + maximum(1.0, 2.0, 3.0));
		System.out.println("The max using integers is " + maximum(1,2,3));

	}
	public static double maximum(double x, double y, double z) {
		double max = x;
		
		if(y > max)
			max = y;
		if(z > max)
			max = z;
		
		return max;
	}

}
