import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
		public static void doInsertionsort(int [] arr){
		int outer, inner, key;
		Random rand = new Random();
		int [] arr = new int[200];
		for(int i = 0; i<arr.length; i++){
			arr[i] = rand.nextInt(100);
		}
		for(outer =1; outer< arr.length; outer++){
			key = arr[outer];
			inner = outer-1;
			
			while(inner>= 0 && arr[inner]> key){
				arr[inner+1] = arr[inner];
				inner = inner-1;
			}
			arr[inner+1] = key;
		}
		}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
