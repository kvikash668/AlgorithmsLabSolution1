package labsession;

import java.util.Scanner;

public class Transactions {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// get the size of transactions from the user
		
		System.out.println("enter the sizr of transactions");
		int size = sc.nextInt();
	
		//allocate an array of the size given by user
		int[] arr = new int[size];
		
		//iterate the loop to get the values of the transactrions
		System.out.println("enter the values  of transactions");
		for (int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
        // get the number of targerts
		System.out.println("enter the no. of targets");
		int numtargets = sc.nextInt();
		
		
		//loop as many times as we get the number of targets
		
		for(int i = 0;i<numtargets;i++) {
			//get the targets
			System.out.println("Enter the target");
			int target = sc.nextInt();
			
			//again start a loop to calculate the sum of transactions
			int sum = 0;
			for(int j = 0;j<arr.length;j++) {
				//sum till the element
				
			  sum = sum+ arr[j];
			
			//check if the target is reached
			if (sum>=target){
				System.out.println("Target is reached after " + (j+1) + "transactions");
				break;
			}
			if(i==arr.length-1 && sum<target) {
				System.out.println("Target is not acheieved");
			}
			}
			
			
		}
	}

}
