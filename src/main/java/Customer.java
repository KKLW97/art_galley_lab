public class Customer {
    // properties

    private String name;
    private int wallet;
    private int collectedArtwork;

    // constructor

    public Customer(String name){
        this.name = name;
        this.collectedArtwork = 0;
        this.wallet = setWallet();
    }

    public String getName(){
        return this.name;
    }

    public int getWallet(){
        return this.wallet;
    }
    public int setWallet( int amount) {
        this.wallet = amount;
        return this.wallet;
    }

    public int getCollectedArtwork(){
        return this.collectedArtwork;
    }
//    private ArrayList<Collection> collections;


    public void buyArtwork(Gallery gallery){
//        Assume customer buys all artwork for line 30 to be true
        int totalArtworkPrice = 0;
        for (Artwork artwork : gallery.getArtworks()){
            totalArtworkPrice += artwork.getPrice();
            if (totalArtworkPrice <= wallet){
                totalArtworkPrice = (Artwork.getPrice() * Customer.getCollectedArtwork());
                gallery.setArtworkForSale(0);
            }
            
        }
        this.collectedArtwork = totalArtworkPrice;
    }                   // The price amount of artwork sold = +balancebeforesell gallery
                        // total amount of customer wallet after purchase
                        // total amount of gallery
// Assumes customer purchase 2 art pieces
    public void assignArtworkForPurchase(Gallery gallery){
        gallery.setArtworkForSale(gallery.getArtworkForSale(-2));
        this.collectedArtwork = 2;
    }
}
