import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SequenceTest {
    public Sequence sequence = new Sequence();

    @Test
    void CzyZwracaFalszJesliNieZawiera(){
        int[] tab = new int[]{1,4,2,4,5,6};
        assertFalse(sequence.sekwencja(tab));
    }
    @Test
    void CzyZwracaPrawdeJesliZawiera(){
        int[] tab = new int[]{1,2,3,4,5,6};
        assertTrue(sequence.sekwencja(tab));
    }

}
