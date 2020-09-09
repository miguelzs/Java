public class PassArrays {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("args = " + args);
        printArray(args);
        System.out.println("----------------------------------");
        swapArgs(args);
        System.out.println("----------------------------------");
        System.out.println("args = " + args);
        printArray(args);
    }

    public static String[] swapArgs(String[] argsParam) {
        System.out.println("argsParam = " + argsParam);
        String temp = argsParam[0];
        argsParam[0] = argsParam[1];
        argsParam[1] = temp;
        return argsParam;
    }

    private static void printArray(String[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(anArray[i]);
        }
        System.out.println();
    }

}
