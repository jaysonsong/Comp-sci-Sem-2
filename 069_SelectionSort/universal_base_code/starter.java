import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void doSelectionsort(int [] arr){
		int outer, inner, min_index;
		Random rand = new Random();
		int [] arr = new int[200];
		for(int i = 0; i<arr.length; i++){
			arr[i] = rand.nextInt(100);
		}
			for(int outer = 0;outer<arr.length-1;outer++){
				min_index = outer;
			for(int inner = outer+1; inner<arr.length-1;inner++ ){
				if(arr[inner] < arr[min_index]){
					min_index = inner;
				}
					int temp = arr[inner];
					arr[inner]= arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
