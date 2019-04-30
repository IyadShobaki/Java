/*
 	Iyad Shobaki
    SPRING 2019 Java Programming
    Professor Sharon Hoover
    Lab 12
    4/15/2019
 */
public class Ages {

	public static void main(String[] args) {
		int[] array = {25, 30, 35, 40, 45, 50, 55, 60, 65, 70};
		int total = 0; 
		for (int counter = 0; counter < array.length; counter++)
		{
			System.out.printf("%s%3d:%4d%n", "Age", counter + 1, array[counter]);
		}
		
		for(int i = 0; i < array.length; i++)
		{
			total += array[i];
		}
		
		int average = total / 10;
		
		System.out.printf("%nThe average age is %d",average);
	}

}
