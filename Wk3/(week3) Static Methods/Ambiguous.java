public class Ambiguous {


    public static void max(int a, int b) {
        System.out.println("max(int,int): " + ((a > b) ? a : b) );
    }

    public static void max(double a, double b) {
        System.out.println("max(double,double): " + ((a > b) ? a : b) );
    }


    // Try running with the first two methods above commented out
    public static void max(int a, double b) {
        System.out.println("max(int,double): " + ((a > b) ? a : b) );
    }

    public static void max(double a, int b) {
        System.out.println("max(double,int): " + ((a > b) ? a : b) );
    }

    public static void main(String[] args) {
        max(5, 10); // This call will be ambiguous if first two methods are commented out
        max(5.0, 10);
        max(5, 10.0);
        max(5.0, 10.0); // This call will be lossy (narrowing) if first two methods are commented out
    }
}

