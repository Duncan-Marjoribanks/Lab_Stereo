import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Toshiba", "Ace1");
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Tuned to Radio 1", radio.tune("Radio 1"));
    }

    @Test
    public void hasMake(){
        assertEquals("Toshiba", radio.hasMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Ace1", radio.hasModel());
    }

}
