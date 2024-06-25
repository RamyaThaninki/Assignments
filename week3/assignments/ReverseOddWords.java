package week3.assignments;
public class ReverseOddWords {

	public static void main(String[] args) {
		String text="I am a software tester";
		String[] odd=text.split(" ");
		text="";
		/*char[] charArray=a.toCharArray();
		System.out.print(Arrays.toString(ch));*/
		for(int i=0;i<odd.length;i++) {
			if(i%2!=0) {
				String temp = "";
				char[] ch =odd[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					temp = temp + ch[j];
				}
				odd[i]=temp;
		}
			text=text+odd[i]+" ";
}
		System.out.println(text);
}
}
