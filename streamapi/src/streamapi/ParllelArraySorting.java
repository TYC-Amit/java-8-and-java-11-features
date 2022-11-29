package streamapi;

import java.util.Arrays;

public class ParllelArraySorting {

	public static void main(String[] args) {
		
		int[] i={1,34,32,2,5,67};
		
		for (int j : i) {
			System.out.println(j +" ");
		}
		
		Arrays.parallelSort(i);
		
		System.out.println("\n Arrays element after sorting");
		
		for (int j : i) {
			System.out.println(j+" ");
		}
	}
}
