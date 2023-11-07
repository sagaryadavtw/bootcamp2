import org.example.Length;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    public void shouldReturnTrueIfInputIs1cm(){
        Length length1 = new Length(1);
        Length length2 = new Length(1);
        boolean result = length1.compareLengths(length2);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfInputIs2cm(){
        Length length1 = new Length(1);
        Length length2 = new Length(2);
        boolean result = length1.compareLengths(length2);
        assertFalse(result);
    }
}
