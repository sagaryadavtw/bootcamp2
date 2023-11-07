import org.example.Length;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    public void shouldReturnTrueIfInputIs1cm(){
        Length length = new Length();
        boolean result = length.check("1cm");
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfInputIs2cm(){
        Length length = new Length();
        boolean result = length.check("2cm");
        assertFalse(result);
    }
}
