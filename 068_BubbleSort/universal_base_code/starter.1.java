import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


	public static void doBubblesort(int [] arr){
		int outer, inner;
		Random rand = new Random();
		int [] arr = new int[200];
		for(int i = 0; i<arr.length; i++){
			arr[i] = rand.nextInt(100);
		}
		for(int outer = 0;outer<arr.length-1;outer++){
			for(int inner = 0; inner<arr.length-1;inner++ ){
				if(arr[inner] > arr[inner+1]){
					int temp = arr[inner];
					arr[inner]= arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
	}
	}
}
