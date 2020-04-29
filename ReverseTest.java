import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseTest {
    public Reverse reverse = new Reverse();
    @Test
    void CzyDobrzeOdwraca(){
int tab[] = new int[]{5, 4, 3, 2, 1};
assertArrayEquals(tab, reverse.reversing());
    }
}
