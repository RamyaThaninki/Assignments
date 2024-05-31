package week1.day1assignments;

public class FindOddNumbers {
	public static void main(String args[]) {
		//Using for loop
		/*for(int i=1;i<=10;i++)
		{
			if(i%2==1) {
				System.out.println(i + "is Odd number");
			}
		}*/
		int a[]= {2,4,3,7,9,20,33,12,67,19};
		int count=0;
		//using array and index concept
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
			{
				System.out.println(a[i] + "is odd number");
			}
				/*System.out.println(a[i] + "is even number");
			}*/
		}
	}
}
