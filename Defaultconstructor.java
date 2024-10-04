package chapter1;

public class Defaultconstructor {
	 private int id;
	    private String name;
			public Defaultconstructor()//default constructor
			{
				id=0;
				name = " ";
			}
			public void display()
			{
				System.out.println(id+" "+name);
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Defaultconstructor d1 = new Defaultconstructor();
				d1.display();
		}

	}

