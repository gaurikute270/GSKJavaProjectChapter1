public class StaticInstanceVariable {
    static int t=20;
    int p=45;
    public static void main(String[] args) {
        StaticInstanceVariable t =new StaticInstanceVariable();   
     System.out.println(t.p);
     System.out.println(new StaticInstanceVariable().p);
    }

}