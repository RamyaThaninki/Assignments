package week3.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String Value = "We learn Java basics as part of java sessions in java week1";
		int count=0;
		String[] split1=Value.split(" ");
		for(int i=0;i<split1.length;i++) {
			for(int j=i+1;j<split1.length;j++) {
				//using equalsIgnorecase to neglect case sensitive
				if(split1[i].equalsIgnoreCase(split1[j])) {//here if index of i is equal to index of j then it will go inside and print " " in place of duplicates we found at split[j]
						split1[j]=" ";
						count++;
				}
			}
		}
		System.out.println("Modified String");
		String[] split2=split1;
		for(int k=0;k<split2.length;k++) {
		//if(!split2.equals("")) {(we can use this line instead of if(count>0). Both will work.
			if(count>0) {
			System.out.print(split2[k] + " ");
			//for(String split2:split1) {we can use this for each condition instead on line 19 for loop
			//if(!split2.equals("")) {
		}
	}
	}
}
