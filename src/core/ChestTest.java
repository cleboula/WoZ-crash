package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChestTest {

	private Chest chest1,chest2, chest3;
    private Key content;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    public void setUp()
    {
        chest1 = new Chest(content, "chest", "Contents a map");
    }
    
    @Test
    public void testCreation()
    {
        chest1.getIsOpened();
        assertEquals(false, chest1.getIsOpened());
        chest1.getName();
        assertEquals("chest", chest1.getName());
        chest1.getDescription();
        assertEquals("Contents a map", chest1.getDescription());  
    }
    
    @Test
    public void testIsOpenedFalse()
    {
        chest2 = new Chest(content, "chest2", "contents a map");
    	chest2.getIsOpened();
        assertEquals(false, chest2.getIsOpened());
    }
    
    @Test
    public void testIsOpenedTrue()
    {
        chest3 = new Chest(content, "chest3", "contents a map");
        chest3.open();
    	chest3.getIsOpened();
        assertEquals(true, chest3.getIsOpened());
    }
    
    @Test
    public void testCheckChestNoKey()
    {
        chest3 = new Chest(content, "chest3", "contents a map");
    	chest3.checkChest();
        assertEquals(false, chest3.getIsOpened());
    }
    
    @Test
    public void testCheckChestWithKey()
    {
        chest3 = new Chest(content, "chest3", "contents a map");
    	chest3.checkChest();
        assertEquals(true, chest3.getIsOpened());
        assertEquals(true, content.searchInventory());
    }
}
