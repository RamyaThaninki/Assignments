package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 10, 6, 8};
		//int[] A = {420,532,699,222};
		//int temp = 0;
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		for(int i=0;i<A.length-1;i++){
			if(A[i+1]-A[i]>1) {
				for(int j=A[i]+1;j<A[i+1];j++) {
					System.out.print(j + " ");
			}
			}
		}
	}
}

