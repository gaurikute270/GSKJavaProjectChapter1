package chapter1;

public class Static2 {
       static int x = 20; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static2 t = new Static2();
	    Static2 s = new Static2();
	    Static2 y = new Static2();
		s.x = t.x + 5;
		t.x = s.x + 5;
		System.out.println(t.x);
	}

}
