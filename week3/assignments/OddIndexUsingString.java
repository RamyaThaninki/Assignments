package week3.assignments;

import java.util.Arrays;

public class OddIndexUsingString {

	public static void main(String[] args) {
		String a="changeme";
		char[] ch=a.toCharArray();
		System.out.print(Arrays.toString(ch));
		for(int i=0;i<=ch.length-1;i++) {
			if(i%2!=0){
				ch[i]=Character.toUpperCase(ch[i]);
				//System.out.println(ch);
			}
		}
			String My=new String(ch);
			System.out.println(My);
		}
	}

