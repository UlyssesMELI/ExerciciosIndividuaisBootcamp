package ex1;

import java.util.List;

public class SortUtil {


	public static <T> void sort (List<Precedente <T>> arr[]) {
		for(List<Precedente <T>> lst : arr) {
			bubbleSort(lst);
		}

	}


	public static <T> void bubbleSort(List<Precedente <T>> lstP) {
		  for (int i = 0; i < lstP.size() - 1; i++) {
		    for (int k = i + 1; k < lstP.size(); k++) {
		      // Compare left to right, not right to left.
		    	Precedente<T> a = lstP.get(i);
		    	Precedente<T> b = lstP.get(k);
		    	if (a.precedeA((T) b) > 0) {
		        Precedente<T> temp = a;
		        lstP.set(i, (Precedente<T>) b);
		        lstP.set(k, (Precedente<T>) a);
		      }
		    }
		  }
		}
} 

