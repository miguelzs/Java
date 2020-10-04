public class Wallet {
    //make sure that CreditCard_B exists in the current directory
    private CreditCard myCard;

    public Wallet () {
        //initiallize myCard

    }


    public Wallet(Wallet anotherWallet) {
        // shallow copy;
        // we have created an alias between the credit cards in the 2 MyWallet objects
        this.myCard = anotherWallet.myCard;
    }


    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.myCard.setName("visa");

        Wallet yourWallet = new Wallet(myWallet);

        System.out.println(myWallet.myCard);
        System.out.println(yourWallet.myCard);

        myWallet.myCard.setName("mastercard");

        System.out.println(myWallet.myCard);
        System.out.println(yourWallet.myCard);
    }
}
