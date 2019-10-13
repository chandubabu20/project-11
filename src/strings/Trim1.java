package strings;  

public class Trim1 {
	public static void main(String[] args) {
		String s1="  hcl chennai sholing campus  ";
		System.out.println(s1.trim()+"**");  //using trim method
		
		//without using trim method(only for trailing spaces)
		int i1=0,i2;
		for(int i=0;i<s1.length();i++)
		{
			if (s1.charAt(i)==' ')
				continue;
			else
				i1=i;
				break;
		}
		System.out.println(s1.substring(i1)+"**");
	}
}
