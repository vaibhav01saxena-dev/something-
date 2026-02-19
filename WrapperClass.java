public class WrapperClass {
    public static void main(String[] args) {
        boolean a = true;            
        Boolean b = Boolean.valueOf(a);
        boolean c = b;                 
        System.out.println(a + " " + b + " " + c);
    }
}
