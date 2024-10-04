class Number1{
    public void Display(){
        System.out.println("i am in number");
    }
}
     class AnonymousClassDemo{
        public void createc(){
            Number1 n= new Number1(){
                public void Display(){
                    System.out.println("i am in ananoma");
                }
            };
            n.Display();
        }
    }

    public class AnonymousClassEx {
        public static void main(String[] args) {
            AnonymousClassDemo as1=new AnonymousClassDemo();
            as1.createc(); 
        }

    
     
}

