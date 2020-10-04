//In order to help learn course concepts, I consulted related material that can be
//found at https://www.baeldung.com/a-guide-to-java-enums

public class HeadTA {

  public static void main(String[] args){
    StoneType[] myStones = new StoneType[4];
    giveCollabStatement(myStones, 3, 4);
    StoneType[] noStones = new StoneType[0];
    giveCollabStatement(noStones, 5, 5);
  }

  public static void giveCollabStatement(StoneType[] stones, int rows, int cols){
    boolean noGRADING = true;
    String grad = StoneType.GRADING.name();
    for (StoneType stone : stones){
      if (stone.name().compareTo(grad)==0){
        noGRADING = false;
      }
    }
    if (noGRADING){
      System.out.println("Cannot Grade");
    }else{

      System.out.println("Snaps Fingers");
      boolean[][] collabStatementArray = new  boolean[rows][cols];
      boolean state = false;
      for (int i=0; i<rows; i++){
        for (int j=0; j<cols; j++){
          if (state){
            collabStatementArray[i][j] = true;
            state = false;
            System.out.print("T");
          }else{
            state = true;
            System.out.print("F");
          }
        }
        System.out.println();
      }
    }
  }
}
