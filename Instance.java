package chapter1;

public class Instance {
     int x = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Instance i = new Instance();//object creation 1
          Instance j = new Instance();//object creation 2;
          i.x = i.x + 20;//formula
          System.out.println(i.x);//output-40
          System.out.println(j.x);//output-20
	}

}
