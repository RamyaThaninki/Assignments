package week1.day1assignments;

public class FibonacciSeries {
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		int n=8;
		System.out.print(" Fibonacci series within the range of  " +  n  +" is ");
		for(int i=0;i<n;i++) {
		System.out.print(fibonacci(i));
	}
	}
}

	/*public static void main(String[] args) {
		/*int first=0,second=1;
		int next;
		for(int i=0;i<=10;i++) {
			System.out.print(first + " ");
			next=first+second;
			first=second;
			second=next;
		}
	}*/
