//getting the count of the specific word in a string 
package strings; 

public class Other1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="  hcl chennai sholing nur rot campus  ";
		int count=0;
        int index=s1.indexOf("campus");
        int i=0;
        while(i<index)
        {
        	if (s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
        	count=count+1;
        	i=i+1;
        }
        
        System.out.println(count+"th word");
        

	}

}
