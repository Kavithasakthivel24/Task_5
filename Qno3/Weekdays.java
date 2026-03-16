package Qno3;

import java.util.Scanner;

public class Weekdays {
	
	 public static void main(String[] args) {

	        String[] days = {
	            "Sunday","Monday","Tuesday",
	            "Wednesday","Thursday","Friday","Saturday"
	        };

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter day index (0-6): ");

	        try {
	            int index = sc.nextInt();
	            System.out.println(days[index]);
	        }
	        catch(ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid day index! Enter between 0 and 6.");
	        }
	    }

}
