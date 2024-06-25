package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] CList = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> CompaniesList=new ArrayList<String>();
		//System.out.println();
		Collections.addAll(CompaniesList, CList);
		//collections.sort(Adding collection to a list)
		Collections.sort(CompaniesList);
		System.out.println("Sorted List : " + CompaniesList);
		//CompaniesList.toArray();
		for(int i=CompaniesList.size()-1;i>=0;i--) {
		System.out.print(CompaniesList.get(i));
		if(i>0) {
			System.out.print(", ");
		}
		}

	}

}
