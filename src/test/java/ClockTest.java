import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    private Clock clock;

    @Test
    public void testAddMinutes() {
        clock = new Clock(10, 30);
        clock.addMinutes(40);
        assertEquals(11, clock.getHour());
        assertEquals(10, clock.getMinute());
    }

    @Test
    public void testAddMinutesOverflow() {
        clock = new Clock(23, 50);
        clock.addMinutes(15);
        assertEquals(0, clock.getHour());
        assertEquals(5, clock.getMinute());
    }

    @Test
    public void testSubtractMinutes() {
        clock = new Clock(10, 30);
        clock.subtractMinutes(20);
        assertEquals(10, clock.getHour());
        assertEquals(10, clock.getMinute());
    }

    @Test
    public void testSubtractMinutesUnderflow() {
        clock = new Clock(0, 10);
        clock.subtractMinutes(30);
        assertEquals(23, clock.getHour());
        assertEquals(40, clock.getMinute());
    }

    @Test
    public void testIsMorning() {
        clock = new Clock(9, 0);
        assertTrue(clock.isMorning());
    }

    @Test
    public void testIsNotMorning() {
        clock = new Clock(13, 0);
        assertFalse(clock.isMorning());
    }

    @Test
    public void testIsAfternoon() {
        clock = new Clock(15, 30);
        assertTrue(clock.isAfternoon());
    }

    @Test
    public void testIsNotAfternoon() {
        clock = new Clock(10, 0);
        assertFalse(clock.isAfternoon());
    }
}
