package chapter1;

public class vari2 {
   int x = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vari2 t = new vari2();
		vari2 s = new vari2();
		vari2 y = new vari2();
		s.x = t.x + 5;
		t.x = s.x + 5;
		System.out.println(t.x);
	}

}
