import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SimpleNumbersTest {

    @Test
    public void simpleNumbersTest() {
        List<Integer> numbers = Arrays.asList(2, 3, 5, 6); //проверочный List с ошибкой
        Assertions.assertEquals(SimpleNumbers.genSimples(10), numbers);
    }



}
