package week8Practice;
import java.util.Scanner;
public class Midterm {

	public static void main(String[] args) {
		SurveyUser();
//		  Scanner input = new Scanner(System.in);
//
//	        double total = 0;        
//	        int wieghtCounter = 0; 
//	        double wieght;        
//	        double average;   
//	        System.out.print("Enter a weight value or enter -999 to quit: ");
//	        wieght = input.nextDouble();
//	        while (wieght != -999) 
//	        {
//	            total = total + wieght;           
//	            wieghtCounter = wieghtCounter + 1;    
//	            System.out.print("Enter a weight value or enter -999 to quit: ");  
//	            wieght = input.nextDouble();      
//	        }
//	        
//	        average =  total / wieghtCounter;  
//	        
//	        System.out.printf("\nTotal of all %d wieght values is %.2f\n", wieghtCounter, total);
//	        System.out.printf("Weight average is %.2f\n", average);
//	    }
	}
	 public static void SurveyUser ()
	    {
		 Scanner input = new Scanner(System.in);
		 int age;
		 
		 System.out.print("Please enter your age:\n");  
         age = input.nextInt(); 
         
         System.out.println("You are " + age + " years old");
	    }
	}


//Scanner input = new Scanner(System.in);
//int number= 0;
//int age;
//int sum = 0;
//while (number < 3) {
//	System.out.println("Please enter an age: ");
//	age = input.nextInt(); 
//	sum += age;
//	number++;
//}
//System.out.println("The sum of the ages = " + sum);
