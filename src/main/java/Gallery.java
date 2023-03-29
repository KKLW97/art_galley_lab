import java.util.ArrayList;

public class Gallery {
    private String name;
    private ArrayList<Artwork> artworks;
    private int tillBalance;
    private int artworkForSale;

    public Gallery(String name){
        this.name = name;
        this.artworkForSale = getArtworksCount();
        this.artworks = new ArrayList<Artwork>();
        this.tillBalance = 0;

    }
//    Methods
    public int getArtworksCount(){
        return this.artworks.size();
    }

//Setters and Getters
    public String getName(){
        return this.name;
    }

    public int getArtworkForSale(int i){
        return this.artworkForSale;
    }

    public void setArtworkForSale(int amount) {
        this.artworkForSale = amount;
    }

    public ArrayList<Artwork> getArtworks(){
        return this.artworks;
    }

    public void increaseTillBalance(int increaseBalance){
        this.tillBalance += increaseBalance;
    }

//    public void Artworks(Gallery gallery, Artworks artworks){
//        wallet -= Artwork.getPrice() * Customer.getCollectedArtwork();
//        gallery.
//    }

    public void setTillBalance(int newBalance){
        this.tillBalance =  newBalance;
    }
    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }
}
