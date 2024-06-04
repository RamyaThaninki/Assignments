package week1.day2assignments;

public class CheckPalindrome {
	public static void main(String[] args) {
		int num=868,reversednum=0,temp;
		int rem;
		temp=num; //now temp=868
		while(num!=0)//868!=0
		{
			rem=num%10;//to get remainder
			reversednum=(reversednum*10)+rem; 
			num=num/10;
		}
				if(temp==reversednum)
					System.out.println("Palindrome");
				else
					System.out.println("Not palindrome");
			}
			
		}
