package fr.crash.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NpcDialogTest {
    private NpcDialog npcdialog1;


    @Test
    public void returningthename()
    {
        npcdialog1 = new NpcDialog("butters","the bug tester", job.citizen);
        assertEquals("butters",npcdialog1.getName());
    }

    @Test
    public void returningthedescription()
    {
        npcdialog1 = new NpcDialog("butters","the bug tester", job.citizen);
        assertEquals("butters",npcdialog1.getDescription());
    }

    @Test
    public void returningthejob()
    {
        npcdialog1 = new NpcDialog("butters","the bug tester", job.citizen);
        assertEquals("butters",npcdialog1.getJobnpc());
    }






    @Test
    void speak() {
    }

}