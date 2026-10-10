class ConstOverloading{
    int a; double b; String c;
    ConstOverloading(){
        a= 10; b = 25.22; c = "I am addicted to success";
    }
    ConstOverloading(int x){
        a=x;
    }
    ConstOverloading(double y, String z)
    {
        b=y;
        c=z;
    }
  
        public static void main(String [] args){

    
        ConstOverloading r = new ConstOverloading();
        ConstOverloading r2 = new ConstOverloading(12);
        ConstOverloading r3 = new ConstOverloading(34.49, "Deboleena");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);
        }
    }
