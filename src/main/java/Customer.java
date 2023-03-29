public class Customer {
    // properties

    private String name;
    private double wallet;

    // constructor

    public Customer(String name){
        this.name = name;
        this.wallet = 0;
    }

    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    private ArrayList<Collection> collections;


    public void buyArtwork(Gallery gallery){
//        Assume customer buys all artwork for line 30 to be true
        int totalArtworkPrice = 0;
        for (Artwork artwork : gallery.getArtworks()){
            totalArtworkPrice += artwork.getPrice();
            if (totalArtworkPrice <= wallet){
                gallery.setTillBalance(gallery.increaseTillBalance(totalArtworkPrice));
                gallery.setArtworkForSale(0);
            }
            
        }
        this.collectedEggs = totalEggs;
    }

    public void assignEggsForSale(Farm farm){
        farm.setEggsForSale(this.collectedEggs - 2);
        this.collectedEggs = 2;
    }
}
