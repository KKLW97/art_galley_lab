import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {
    Artwork outdoorscenery;

    @BeforeEach
    public void setUp(){
        outdoorscenery = new Artwork("outdoorscenery", "Taliane");
    }

    @Test
    public void hasName(){
        assertThat(outdoorscenery.getName()).isEqualTo("outdoorscenery");
    }

    @Test
    public void hasArtistName(){
        assertThat(outdoorscenery.getArtistName()).isEqualTo("Taliane");
    }

    @Test
    public void hasSetPrice(){
        outdoorscenery.setPrice(500);
        assertThat(outdoorscenery.getPrice()).isEqualTo(500);
    }

}
