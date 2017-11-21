package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedikitTest {
    
    @Test
    public void testCure()
    {
        Player player1 = new Player("toto");
        Medikit medikit1 = new Medikit(20, 10, "Medicine", "Small medikit to help you");
        player1.setHp(50);
        player1.setEp(50);
        medikit1.cure(medikit1);
        assertEquals(70, player1.getHP());
        assertEquals(60, player1.getHP());        
    }

}
