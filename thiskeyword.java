package chapter1;

public class thiskeyword {
        private int rollno;
        private String name;
        private float fee;
        public thiskeyword(int rollno,String name,float fee)
        {
        	this.rollno = rollno;
        	this.name = name;
        	this.fee = fee;
        }
        public void display()
        {
        	System.out.println(rollno+" "+name+" "+fee);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        thiskeyword t1 = new thiskeyword(111,"Gauri",4000);
        thiskeyword t2 = new thiskeyword(222,"Sanyog",5000);
        t1.display();
        t2.display();
        }
	}
