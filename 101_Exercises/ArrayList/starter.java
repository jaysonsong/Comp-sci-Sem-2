import java.util.*;


public void printArrayList(ArrayList<String>arr){
	for(int i=0;i<arr.size();i++){
		int roc = arr.get(i);
		
		System.out.println(i);
	}
}
public void addValuesArrayList(ArrayList<String>arr, int n){
	for(int i=0;i<n;i++){
		arr.add(i,"Chickens");
	}
}
class starter {
	//Methods go here

	public static void main(String args[]) {
		ArrayList <String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want?: ");
		int chnum = sc.nextInt();
		addValuesArrayList(arr,chnum);
		printArrayList(arr);
	



	}
}
