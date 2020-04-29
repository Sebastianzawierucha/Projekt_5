import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {
    public Temperature temperature = new Temperature();

    @Test
void obieNieSpelniaja(){
        assertFalse(temperature.comparison(100,100));
    }
    @Test
    void jednaSpelniaDrugaNie(){
        assertTrue(temperature.comparison(99,100));
    }
    @Test
    void jednaNieDrugaSpelnia(){
        assertTrue(temperature.comparison(100,99));
    }
    @Test
    void ObieSpelniaja(){
        assertTrue(temperature.comparison(99,99));
    }
}
