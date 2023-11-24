import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repetition.SortAndCalculation;

public class RepetitionTest {

    @Test
    public void testSort(){
        int[] array = new int[]{9, 3, 4, 6, 2, 11, 33, 2};
        SortAndCalculation.sort(array);
        Assertions.assertEquals(2, array[0]);
        Assertions.assertEquals(11, array[6]);
        Assertions.assertEquals(33, array[7]);


    }

    @Test
    public void testMedian(){
        int[] array1 = new int[]{9, 3, 4, 7, 2, 11, 33, 2};
        Assertions.assertEquals(5.5, SortAndCalculation.calculateMedian(array1));

        int[] array2 = new int[]{9, 3, 4, 7, 2, 11, 2};
        Assertions.assertEquals(4, SortAndCalculation.calculateMedian(array2));
    }

    @Test
    public void testRange(){
        int[] array = new int[]{20, 20, 30, 30, 1};
        Assertions.assertEquals(29, SortAndCalculation.calculateRange(array));
    }
}
