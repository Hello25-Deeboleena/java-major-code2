//using deafault constructor
class CopyConstructor {
    int a; String b;
    CopyConstructor()
    {
        a=10; b="Addicted to coding";
        System.out.println(a+" "+b);
    }
    CopyConstructor(CopyConstructor ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
        public static void main(String[] args) {
            
            CopyConstructor r = new CopyConstructor();
            CopyConstructor r2 = new CopyConstructor(r);
    }

}
