public class Artwork {

    private String name;
    private String artistName;
    
    private int price;

    private String nft;

    public Artwork(String name, String artistName) {
        this.name = name;
        this.artistName = artistName;
        this.price = setPrice();
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


    public int getPrice(){
        return this.price;
     }

     public void setPrice(int newPrice){
         this.price = newPrice;
     }

     public String getNft(){
        return nft;

     }
// Creates unique Nft ID
     private static long idNft= 0;
     public static synchronized String createNft(){
        return String.valueOf(idNft++);
     }

    }
