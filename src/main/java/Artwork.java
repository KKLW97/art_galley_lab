public class Artwork {

    private String name;
    private String artistName;

    private double price;

    private String nft;

    public Artwork(String name, String artistName, double price) {
        this.name = name;
        this.artistName = artistName;
        this.price = price;
        this.nft = createNft();

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
// Creates unique Nft ID
     private static long idNft= 0;
     public static synchronized String createNft(){
        return String.valueOf(idNft++);
     }

    }


}
