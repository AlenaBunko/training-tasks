import lenaBunko.tasks.MergingSortedArrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MergingSortedArraysTest {

    @DisplayName("MergingSortedArraysTest.ifBothArraysHaveLengthGreaterThanZero()")
    @Test
    void ifBothArraysHaveLengthGreaterThanZero() {

        int[] methodResult = MergingSortedArrays.mergeArr(new int[]{1, 4}, new int[]{1, 2, 4, 6, 7});

        assertArrayEquals(new int[]{1, 1, 2, 4, 4, 6, 7}, methodResult);
    }

    @DisplayName("MergingSortedArraysTest.ifOneOfTheArraysIsEmpty()")
    @Test
    void ifOneOfTheArraysIsEmpty() {

        int[] methodResult = MergingSortedArrays.mergeArr(new int[]{}, new int[]{3, 4});

        assertArrayEquals(new int[]{3, 4}, methodResult);
    }
}
