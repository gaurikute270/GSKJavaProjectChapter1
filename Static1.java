package chapter1;

public class Static1 {
     static int x = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static1 t = new Static1();
	    Static1 s = new Static1();
	    Static1 y = new Static1();
		s.x = t.x + 5;
		t.x = s.x + 5;
		System.out.println(y.x);
	}

}
