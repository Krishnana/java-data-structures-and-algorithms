/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testInsertShiftArray() {
        ArrayShiftLibrary classUnderTest = new ArrayShiftLibrary();
        int[] testArray = {1,2,3};
        int testVal = 999;
        assertArrayEquals("Expected value is not matching actual", new int[]{1, 999, 2, 3}, classUnderTest.insertShiftArray(testArray,testVal));
    }
}
