public class PrivateConstructor {
    int a; double b; String c;
    private PrivateConstructor(){
        a=10;
        b=10.55;
        c="I am addicted to coding";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        PrivateConstructor r = new PrivateConstructor();
    }
}
