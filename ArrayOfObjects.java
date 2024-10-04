package chapter1;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std[] = new Student[3];//array of reference variables of student
		  std[0] = new Student();//convert each reference variable into student object
		  std[1] = new Student();
		  std[2] = new Student();
		  std[0].marks = 40;
		  std[1].marks = 50;
		  std[2].marks = 60;	  
		  System.out.println("\n Students average marks:"+(std[0].marks+std[1].marks+std[2].marks)/3);

	}

}
	
