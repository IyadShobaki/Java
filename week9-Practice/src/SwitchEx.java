import java.util.Random;
public class SwitchEx {

	public static void main(String[] args) {
		
		Random diceRoller = new Random();
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
		
		for (int i = 0; i < 50; i++) {
			int roll = diceRoller.nextInt(6) + 1;
			switch (roll) {
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			case 5:
				count5++;
				break;
			case 6:
				count6++;
				break;
			}
		}

		System.out.println("count of 1: " + count1);
		System.out.println("count of 2: " + count2);
		System.out.println("count of 3: " + count3);
		System.out.println("count of 4: " + count4);
		System.out.println("count of 5: " + count5);
		System.out.println("count of 6: " + count6);
	}

}
