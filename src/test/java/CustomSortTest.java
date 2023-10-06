import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomSortTest {

    @Test
    public void testCustomSort(){
        int[] array = {3, 7, 2, 9, 7, 1, 4, 5};
        CustomSort.sort(array);
        Assertions.assertEquals(1, array[0]);
        Assertions.assertEquals(2, array[1]);
        Assertions.assertEquals(3, array[2]);
        Assertions.assertEquals(4, array[3]);
        Assertions.assertEquals(5, array[4]);
        Assertions.assertEquals(7, array[5]);
        Assertions.assertEquals(7, array[6]);
        Assertions.assertEquals(8, array[7]);

    }
}
