package labsession;

import java.util.Scanner;

public class MinimumNotes {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//get the number of denominations
		System.out.println("Enter the no. of denominations");
		int size = sc.nextInt();
		
		//allocate an array called as "notes" to hold denominations
		int[] notes = new int[size];
		int[] numNotes = new int[size];
		//get the denominations in the loop - 100, 500, 2000
		System.out.println("Enter the  denominations");
		for(int i=0;i<size;i++) {
			notes[i] = sc.nextInt();	
		}
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(notes, 0,notes.length-1);
		
		//check sort
		for(int j=0;j<notes.length;j++) {
			System.out.println(notes[j]);
		}
	//what is the amount to pay
		System.out.println("enter the amount to pay");
		int amount =sc.nextInt();
	//pick the notes
		try {
			for(int i =0;i<notes.length;i++) {
				//find the no. of notes
				int n =(int) ( amount/notes[i]);
				numNotes[i] =n;
				System.out.println(notes[i] + ":" + n);
				//set amount to the remaining amount
				amount = amount-(n* notes[i]);
				// write a condition to find if it is not possible 
				//print a message "not possible to pay amount"
				if(i == notes.length-1 && amount != 0) {
					System.out.println("not possible to pay amount");
				}else if (i == notes.length-1 && amount == 0) {
					for(int j= 0; j<numNotes.length; j++) {
						System.out.println(notes[j]+ ":" + numNotes[j]);
					}
				}
				
			}
		} catch (Exception e) {
			System.out.println("Enter 0 as the denominatios");
			//e.printStackTrace();
		}
		
	}

}
