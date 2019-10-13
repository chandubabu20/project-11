package strings;

public class Replace1 {

	public static void main(String[] args) {
	
		String s1="javatpoint is a very good website";
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'
		System.out.println(replaceString);	
	    System.out.println(s1.substring(0,2) + 'z' + s1.substring(3));//To replace a character at a specified position

	}

}
 