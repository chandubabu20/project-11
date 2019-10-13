package sample;

public class PG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  Geeks, For, Geeks,    "; 
		System.out.println("original :"+str);
        int len= str.length();
        System.out.println("length: "+len);
        int i=len;
       
        while((str.charAt(i-1))==' ')
        {
        	i--;
        }
        str=str.substring(0,i);
        System.out.print("modified :"+str+"---");
        
	}
}
