public class Wallet {
    //make sure that CreditCard exists in the current directory
    private CreditCard myCard;

    public Wallet () {
        //initiallize myCard
        this.myCard = new CreditCard("AMX");

    }


    public Wallet(Wallet anotherWallet) {
        // shallow copy;
        // we have created an alias between the credit cards in the 2 MyWallet objects
        //this.myCard = anotherWallet.myCard;

        //instead let's use a copy constructor on the Credit Card class
        this.myCard = new CreditCard(anotherWallet.myCard);
    }


    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.myCard.setName("visa");

        Wallet yourWallet = new Wallet(myWallet);

        System.out.println(myWallet + "\t" + myWallet.myCard);
        System.out.println(yourWallet + "\t" + yourWallet.myCard);
        System.out.println();
        myWallet.myCard.setName("mastercard");

        System.out.println(myWallet + "\t" +myWallet.myCard);
        System.out.println(yourWallet + "\t" +yourWallet.myCard);

        yourWallet.myCard.setName("visa");
        System.out.println(myWallet + "\t" + myWallet.myCard);
        System.out.println(yourWallet + "\t" + yourWallet.myCard);

    }
}
