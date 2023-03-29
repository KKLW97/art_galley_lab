public class Artwork {

    private String name;
    private String artistName;

    private double price;

    private int nft;

    public Artwork(String name, String artistName, double price, int nft) {
        this.name = name;
        this.artistName = artistName;
        this.price = price;
        this.nft =

    }
//    getters and setters
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getArtistName() {
        return artistName;
    }


    public double getPrice(){
        return price;
     }

     public void setPrice(double newPrice){
         this.price = newPrice;
     }

     public int getNft(){
        return nft;
     }

  


}
