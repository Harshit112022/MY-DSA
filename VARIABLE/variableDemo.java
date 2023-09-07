package variable;

class class2
{
    int a =10;   //instasnt variable
    static int b =999; //static variable
    void  m1()
    {
        System.out.println("Radhe radhe");
        System.out.println(a);//instant varible not able to use in static fild
        System.out.println(b);//static varible can use in instant class
    }
}


public class variableDemo {

    public static void main(String[] args) {
        class2 class2 = new class2();
        class2.m1();
        class2.b=1000; // singal copy is created didn't depand upon object
        class2.a=1000;// mutipal copy is created respective to object
        class2.m1();

        System.out.println("------------------------------------------");
        class2 class22 = new class2();
        class22.m1();
        class22.m1();

    }
}

