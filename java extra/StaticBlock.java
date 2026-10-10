
public class StaticBlock {
    StaticBlock(){//constructor block
        System.out.println("I am addicted to badminton");
    }
    {//instance block
        System.out.println("I am addicted to coding");
    }
    static{//static block
        System.out.println("I am addicted to success");
    }
    public static void main(String[] args) {
        StaticBlock r = new StaticBlock();
    }
}
