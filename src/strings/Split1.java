// split a sentence in to an array of words (ex: divide by spaces)
package strings;

public class Split1 {

	public static void main(String[] args) {
	
		String s1="hcl chennai sholing campus";
		 String[] arrSplit = s1.split(" ");
		    for (int i=0; i < arrSplit.length; i++)
		    {
		      System.out.println(arrSplit[i]);
		    }		
	}
     
}
