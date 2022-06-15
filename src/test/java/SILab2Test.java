import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    List<String> emptyArray = new ArrayList<String>();
    List<String> notPerfectSquareArray = Arrays.asList("0", "#", "0");
    List<String> validArray = Arrays.asList("0","#","0","#","0","#","0","0","0");
    List<String> expectedArray = Arrays.asList("2","#","2","#","3","#","1","0","1");

    @Test
    void everyStatementTest() {
        IllegalArgumentException emptyArrayException = assertThrows(IllegalArgumentException.class, () -> {
            SILab2.function(emptyArray);
        });

        IllegalArgumentException notPerfectSquareException = assertThrows(IllegalArgumentException.class, () -> {
            SILab2.function(notPerfectSquareArray);
        });

        assertEquals("List length should be greater than 0", emptyArrayException.getMessage());
        assertEquals("List length should be a perfect square", notPerfectSquareException.getMessage());
        assertEquals(expectedArray, SILab2.function(validArray));
    }
}