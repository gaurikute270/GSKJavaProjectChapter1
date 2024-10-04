package chapter1;

public class variable {
      static int z = 30;//static variable
      int x = 20;//instance variable
      public void M1()
      {
    	  int y = 10;//local variable
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable v1= new variable();
        variable v2 = new variable();
        //System.out.println(x);//20
       //System.out.println(v1.x);//20
        System.out.println(variable.z);//30
        //System.out.println(v2.y);//10
	}

}
