package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int[] A={3, 2, 11, 4, 6, 7};
		//for(int i=0;i<A.length-1;i++)//we can use or remove this loop. Their won't be a change in o/p
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		//1st
		for(int i=0;i<A.length;i++) {
			if(A[i]==A[A.length-2]) {
				System.out.println("Second Largest is : " + A[i]);
			}
		}
		//2nd - we can use like below also	
		//int SecondLargest = A[A.length-2];
			//System.out.println("Second Largest Element is : " + SecondLargest);
	}
	}
