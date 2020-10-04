public class NpeExample {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Suzy W";
        names[1] = "Ricky L";

        // NPE 1: for each loop that iterates over all elements of an array
        for(String s : names)
            System.out.println(s.toLowerCase());

        // NPE 2
        String aString = null;
        System.out.println(aString.toUpperCase());

        // ArrayIndexOutOfBoundsException
        System.out.println(args[0]);

        // example of printing all arguments to the program using for-each loop
        for(String a:args)
            System.out.println(a);

    }
}