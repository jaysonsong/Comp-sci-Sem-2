import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList <String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want?: ")
		int chnum = sc.nextInt();
		for(int i=0;i<chnum;i++){
			arr.add(i,"Chickens");
			
		}
		for(int i=0;i<arr.size();i++){
		int roc = arr.get(i)
		
		System.out.println(roc);
	}
}
}
