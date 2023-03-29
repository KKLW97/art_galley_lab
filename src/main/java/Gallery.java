import java.util.ArrayList;

public class Gallery {
    private String name;
    private ArrayList<Artwork> artworks;
    private double tillBalance;
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

    public int getArtworkForSale(){
        return this.artworkForSale;
    }

    public void setArtworkForSale(int amount) {
        this.artworkForSale = amount;
    }

    public ArrayList<Artwork> getArtworks(){
        return this.artworks;
    }

    

}
