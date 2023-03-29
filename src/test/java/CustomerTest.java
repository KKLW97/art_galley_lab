import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    Customer customer;
    Gallery gallery;
    Artwork outdoorscenery;
    Artwork lakescenery;
    Artwork townscenery;

    @BeforeEach
    public void setup(){
        customer = new Customer("Kelly");
        gallery = new Gallery("Hyde Park Gallery");
        outdoorscenery = new Artwork("outdoorscenery", "Taliane");
        lakescenery = new Artwork("lakescenery", "Taliane");
        townscenery = new Artwork("townscenery", "Taliane");
        gallery.addArtwork(outdoorscenery);
        gallery.addArtwork(lakescenery);
        gallery.addArtwork(townscenery);
    }
    @Test
    public void hasName(){
        assertThat(customer.getName()   ).isEqualTo("Kelly");
    }
    
}
