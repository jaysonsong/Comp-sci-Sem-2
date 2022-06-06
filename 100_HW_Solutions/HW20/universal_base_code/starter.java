import pkg.*;
import java.util.*;
		
class starter {
	
	public static void SelectionSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(pos))
                    pos = j;
            }
       
            int min = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, min);
            printOut(i + 1, arr);
        }
    }
	public static void doBubblesort(ArrayList<Integer> list){
    int too;
    	if (list.size()>1) {
        	for (int x=0; x<list.size(); x++) {
            for (int i=0; i < list.size()-i; i++) {
                if (list.get(i).compareTo(list.get(i+1)) > 0)
                {
                    too = list.get(i);
                    list.set(i,list.get(i+1) );
                    list.set(i+1, too);
                }
            }
        }
    }

}
public static void insertionSort(ArrayList<Integer> array) {
    int i, j;
    for (i = 1; i < array.size(); i++) {
        int tmp = array.get(i);
        j = i;
        while ((j > 0) && (array.get(j - 1).value > tmp.value)) {
            array.set(j, array.get(j - 1));
            j--;
        }
        array.set(j, tmp);
    }
}
	public static void main(String args[]) {
		
	}
}
