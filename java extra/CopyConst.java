
//using parameterised constructor
class CopyConst {
    int x, y;
    CopyConst(int a, int b){
        x=a; y=b;
        System.out.println(x+" "+y);
    }
    CopyConst(CopyConst ref){
        x= ref.x;
        y= ref.y;
        System.out.println(x+" "+y);
    }
    class B{
        public static void main(String[] args) {
            CopyConst r = new CopyConst(6, 10);
            CopyConst r2 = new CopyConst(r);
        }
    }
}
