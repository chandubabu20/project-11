package sample;
interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class P1 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
public void qwerty()
{
	System.out.println("in qwerty");
}
}

class Pa{
public static void main(String args[]){  
//P1 obj = new P1();  
Printable obj = new P1(); 
obj.print();  
//obj.show();
//obj.qwerty();
 }  
}  