import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card1;
    Card card2;

    @Before
    public void before(){
        player = new Player();
        card1 = new Card(Suit.SPADES, Rank.FIVE);
        card2 = new Card(Suit.SPADES, Rank.TEN);
        player.takeCard(card1);
        player.takeCard(card2);
    }

    @Test
    public void getHandValue(){
        assertEquals(15, player.getHandValue());
    }
}
