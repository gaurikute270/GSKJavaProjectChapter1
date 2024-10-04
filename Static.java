package chapter1;

public class Static {
   static int x = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Static t = new Static();
	    Static s = new Static();
	    Static y = new Static();
		s.x = t.x + 5;
		t.x = s.x + 5;
		System.out.println(s.x);
	}

}
