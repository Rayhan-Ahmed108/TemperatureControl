import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeInputTest {
    RangeInput ctInput=new RangeInput(40, 60);

    @Test
    void setUp() {
        ctInput.up();
        ctInput.up();
        assertEquals(52,ctInput.getCurrentTemperature());
    }
    @Test
    void setDown() {
        ctInput.down();
        ctInput.down();
        assertEquals(48,ctInput.getCurrentTemperature());
    }
}