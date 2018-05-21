import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cDPlayer;

    @Before
    public void before(){
        cDPlayer = new CDPlayer("Sony", "Walkman");
    }

    @Test
    public void canPlaySong(){
        String result = cDPlayer.play("Britney Spears");
        assertEquals("Playing Britney Spears", result);
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", cDPlayer.hasMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Walkman", cDPlayer.hasModel());
    }


}
