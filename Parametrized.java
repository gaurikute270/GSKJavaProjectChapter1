package chapter1;

public class Parametrized 
{
       private int id;
       private String name;
       public Parametrized(int i,String n)
       {  
    	   id = i;
    	   name = n;
        }
       public void display() 
       {
    	   System.out.println(id+" "+name);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parametrized p1 = new Parametrized(11,"Gauri");
		Parametrized p2 = new Parametrized(22,"Sanyog");
		p1.display();
		p2.display();
 }
}
