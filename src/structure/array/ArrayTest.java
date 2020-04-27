package structure.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/26/2020 9:16 PM
 */
public class ArrayTest {

    @Test
    public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
        List<Integer> empty = new MyArrayList<>();
        List<Integer> empty2 = new MyArrayList<>(2);

        Assert.assertTrue(empty.isEmpty());
        Assert.assertTrue(empty2.isEmpty());
    }

    @Test
    public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
        List<Object> list = new MyArrayList<>();
        list.add(null);
        Assert.assertFalse(list.isEmpty());
    }
}
