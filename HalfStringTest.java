import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HalfStringTest {
    public HalfString halfString = new HalfString();

    @Test
    void CzyPolowa(){
        assertEquals(4, halfString.half(8));
    }
    @Test
    void NieparzystaPolowa(){
        assertEquals(4, halfString.half(9));
    }
}
