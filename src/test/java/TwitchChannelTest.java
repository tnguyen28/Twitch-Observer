
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwitchChannelTest {
    private TwitchChannel tchan1 = new TwitchChannel("teeeler", "Owner");
    TwitchChannel tchan2 = new TwitchChannel("johnnyboy345", "Owner");
    TwitchCustomer tc1 = new TwitchCustomer("tntttom", tchan1);
    TwitchCustomer tc2 = new TwitchCustomer("cjose2064", tchan1);
    TwitchCustomer tc3 = new TwitchCustomer("ninja", tchan2);

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting test up");
    }

    @After
    public void tearDown() throws Exception {
       System.out.println();
    }

    @Test
    public void addObserverTest() throws Exception {
        tchan1.addObserver(tc1);
        assertTrue(tchan1.getTwitchSet().contains(tc1));
        tchan1.addObserver(tc2);
        assertTrue(tchan1.getTwitchSet().contains(tc2));
        tchan2.addObserver(tc3);
        assertTrue(tchan2.getTwitchSet().contains(tc3));
    }

    @Test
    public void removeObserverTest() throws Exception {
        tchan1.removeObserver(tc1);
        assertFalse(tchan1.getTwitchSet().contains(tc1));
        tchan1.removeObserver(tc2);
        assertFalse(tchan1.getTwitchSet().contains(tc2));
        tchan2.removeObserver(tc3);
        assertFalse(tchan2.getTwitchSet().contains(tc3));
        assertTrue(tchan1.getTwitchSet().isEmpty());
        assertTrue(tchan2.getTwitchSet().isEmpty());

    }

    @Test
    public void setSubTypeTest() throws Exception {
        tchan1.setSubType("follower");
        assertEquals("follower", tchan1.getSubscribeType());

        tchan2.setSubType("subscriber");
        assertEquals("subscriber", tchan2.getSubscribeType());
    }

    @Test
    public void getSubscribeTypeTest() throws Exception {
        assertEquals("Owner", tchan1.getSubscribeType());
        tchan1.setSubType("follower");
        assertEquals("follower", tchan1.getSubscribeType());
    }



}
