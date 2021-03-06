package codingame;

import org.junit.Assert;
import org.junit.Test;

public class ChuckNorrisTest {

    @Test
    public void ChuckNorris_with_character_C(){
        Assert.assertEquals("0 0 00 0000 0 00", ChuckNorris.chuckNorris("C"));
    }

    @Test
    public void ChuckNorris_with_character_B(){
        Assert.assertEquals("0 0 00 0000 0 0 00 0", ChuckNorris.chuckNorris("B"));
    }

    @Test
    public void ChuckNorris_with_character_CC(){
        Assert.assertEquals("0 0 00 0000 0 000 00 0000 0 00", ChuckNorris.chuckNorris("CC"));
    }

    @Test
    public void ChuckNorris_with_character_ABC(){
        Assert.assertEquals("0 0 00 00000 0 00 00 0000 0 0 00 0 0 0 00 0000 0 00", ChuckNorris.chuckNorris("ABC"));
    }

}
