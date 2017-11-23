package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class WeaponTest {

	private Weapon weapon1;
    /**
     * Default constructor for test class WeaponTest
     */
    public WeaponTest()
    {
    }
    
    @Test
    public void creation()
    {
        Weapon weapon2 = new Weapon(5, 2, "knife", "weapon for small targets");
        assertEquals("weapon for small targets", weapon2.getDescription());
        assertEquals("knife", weapon2.getName());
    }
    
    @Test
    public void shot()
    {
    	Player player1 = new Player("toto");
    							// degat / energie
        Weapon weapon2 = new Weapon(5, 2, "knife", "weapon for small targets");
        weapon2.shot(player1);
        assertEquals(95, player1.getHP());
        assertEquals(98, player1.getEP());
    }

}
