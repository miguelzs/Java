public class RaggedArrays {

    public static void main(String[] args) {
        int[][] myArray = new int[Integer.valueOf(args[0])][];
        for(int i = 0; i < myArray.length;i++){
            //for each row
            myArray[i] = new int[i];
            for(int j = 0; j<myArray[i].length; j++) {
                if (j != 0 ) {
                    myArray[i][j] = i*j;
                } else {
                    myArray[i][j] = i;
                }
                System.out.printf("%4d ", myArray[i][j]);
            }
            System.out.println();
        }
    }
}