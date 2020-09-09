enum ClassYear {

    FRESHMAN,

    SOPHOMORE,

    JUNIOR,

    SENIOR,

    UNK;
    public static void main(String[] args) {
            ClassYear myYear = ClassYear.SENIOR;
            System.out.println(myYear.name());
            System.out.println(myYear.ordinal());
            switch(myYear) {
                case FRESHMAN:
                    System.out.println("A long road awaits you.");
                    break;
                case SOPHOMORE:
                    System.out.println("Now you're getting it!");
                    break;
                case JUNIOR:
                    System.out.println("You've come so far, "
                        + "but the journey is far fromover.");
                    break;
                case SENIOR:
                    System.out.println("Senioritis is real");
                    break;
                case UNK:
                    System.out.println("\"Life-long learning\" lol");
                    break;
                default:
                    System.out.println("Something's broken.");
                    break;
                }
            }

}