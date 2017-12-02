package fr.crash.core;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class WeaponTest {

  
    /**
     * Default constructor for test class WeaponTest
     */
    public WeaponTest()
    {
    }
    
    
    @Test
    public void creation()
    {
        Weapon weapon2 = new Weapon(5, 2, "knife", "weapon for small targets",null);
        assertEquals("weapon for small targets", weapon2.getDescription());
        assertEquals("knife", weapon2.getName());
        assertEquals(5, weapon2.getDamages(weapon2));
        assertEquals(2, weapon2.getEnergybyshot(weapon2));
    }
    
    @Test
    public void shot()
    {
    	Player player1 = new Player("toto");
    							// degat / energie
        Weapon weapon2 = new Weapon(5, 2, "knife", "weapon for small targets",null);
        weapon2.shot(player1);
        assertEquals(98, player1.getEP());
    }

    
    @Test
    public void hit()
    {
        Player player2 = new Player("toto"); //ep = 100
        Weapon weapon3 = new Weapon(20,10,"gun","can kill",null);    
        weapon3.shot(player2);
    	assertEquals(90, player2.getEP());
    }
    
}
