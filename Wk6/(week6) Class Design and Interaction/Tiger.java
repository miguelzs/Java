public class Tiger {

    public void roar() {
        /// make some noise
        makeNoise();
        //call the go method
        //note there is no object in front of the call
        //there is an implied 'this' object
        go();
    }

    private void go() {
        // go somewhere else
        System.out.println("inside tiger's go method...");
    }
    private void makeNoise() {
        System.out.println("inside tiger's makeNoise method...");
    }
}
