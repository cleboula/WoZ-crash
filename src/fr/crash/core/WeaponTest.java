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
        assertEquals(5, weapon2.getDamages());
        assertEquals(2, weapon2.getEnergybyshot());
    }
    

    
}
