public class LocalVar {

    public void run(){
        char c = 'e';
        System.out.println(c);
    }

    public void test(){
        run(); // Now, this will call the run method
    }

    public static void main(String[] args) {
        LocalVar t = new LocalVar();
        t.test(); // This will call the test method, which in turn calls run
    }

}