public class BadScope {

    public static void main(String[] args) {
        method1(5);
        int a = BadScope.method3(20);
        System.out.println(a);
        BadScope.method2(BadScope.method3(20));
    }

    public static int method1(int a) {
        System.out.println("You passed in " + a);
        //What if we declare an int variable a?
        a = 0;

        return a;
    }

    public static int method2(int a) {
        System.out.println("You passed in " + a);
        for (int i = 0; i < 10; i++) {
            //What if we declare an int variable i?
            //int i = 99;
            System.out.println("i == " + i);
        }
        //int i = 99;
        return a;
    }

    public static int method3(int a) {
        System.out.println("You passed in " + a);
        //int i = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("i == " + i);
        }
        //System.out.println(i);
        //this is fine, the scope of i is only within the loop
        for (int i = 0; i > 0 && i < 20; i++) {
            System.out.println("i == " + i);
        }

        //Can we return i instead on 90?
        return 90;
    }
}
