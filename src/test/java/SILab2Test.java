import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void function() { //everystatement

    }

    @Test
    void EveryStatementBrnachTest(){
        List<String> tc1 = List.of();
        List<String> tc2 = List.of("0", "#", "#", "0", "0", "#");
        IllegalArgumentException ilar = null;

        ilar = assertThrows(IllegalArgumentException.class, ()->SILab2.function(tc1));
        assertTrue(ilar.getMessage().contains("List length should be greater than 0"));

        ilar = assertThrows(IllegalArgumentException.class, ()->SILab2.function(tc2));
        assertTrue(ilar.getMessage().contains("List length should be a perfect square"));

        List<String> tc3 = List.of("0", "#", "#", "0");
        List<String> op3 = List.of("2", "#", "#", "2");
        assertEquals(SILab2.function(tc3), op3);

        List<String> tc4 = List.of("#", "0", "0", "#", "0", "0", "#", "0", "#");
        List<String> op4 = List.of("#", "1", "0", "#", "1", "1", "#", "2", "#");
        assertEquals(SILab2.function(tc4), op4);
    }
}