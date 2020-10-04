public class Wallet {
    //make sure that CreditCard_B exists in the current directory
    private CreditCard myCard;

    public Wallet () {
        //initiallize myCard
        this.myCard = new CreditCard("AMX");
    }


    public Wallet(Wallet anotherWallet) {
        // shallow copy;
        // below we have created an alias between the credit cards in the 2 MyWallet objects
        //this.myCard = anotherWallet.myCard;

        //instead we want to use the copy constructor on any fields that are not primitive to create a deep copy
        this.myCard = new CreditCard(anotherWallet.myCard);
    }


    public String toString() {
        return myCard.toString();
    }

    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.myCard.setName("visa");


        Wallet yourWallet = new Wallet(myWallet);

        System.out.println(myWallet + "\t" + myWallet.myCard);
        System.out.println(yourWallet + "\t" + yourWallet.myCard);

        myWallet.myCard.setName("mastercard");

        System.out.println(myWallet.myCard);
        System.out.println(yourWallet.myCard);
    }
}
