package week1.day1assignments;

public class IsPrimeNumber {
	public static void main(String args[]){
		//should be natural number>1
		//should divide by 1 and only itself(only 2 factors)
		/*int num=4;
		int count=0;
		if(num>1)
		{
		   for(int i=1;i<=num;i++)
		   {
			 if(num%i==0)
				 count++;
		   }
		   if(count==2)
		   {
			   System.out.println("Prime Number");
		   }
		   else
		   {
			   System.out.println("Not Prime Number");
		   }
		}
		else
		{
			System.out.println("Not Prime Number");
		}*/
		int num=15468;
		boolean isprime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
				break; //Here by using break statement we no need to check the condition multiple times.Once condition fails it will break from loop and checks next line.
			}
		}	
		if(isprime)
		{
			 System.out.println(num +"is prime number");	
		}
		else
		{
			 System.out.println(num +"is not prime number");
		}
	}
}

