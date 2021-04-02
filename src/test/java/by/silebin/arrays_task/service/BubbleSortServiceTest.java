package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import by.silebin.arrays_task.service.impl.BubbleSortService;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BubbleSortServiceTest {

    private static final int[] ARRAY = new int[]{48, 89, 26, 3};
    private static final int[] SORTED_ARRAY = new int[]{3, 26, 48, 89};
    private static final int[] EMPTY_ARRAY = new int[]{};
    private SortService service;

    @BeforeTest
    private void init() {
        service = new BubbleSortService();
    }

    @Test
    public void testSort() throws EmptyArrayException {
        ArrayEntity initialArray = new ArrayEntity(ARRAY);
        ArrayEntity expectedArray = new ArrayEntity(SORTED_ARRAY);
        service.sort(initialArray);
        Assert.assertEquals(initialArray, expectedArray);
    }

    @Test
    public void testSort_SortedArray() throws EmptyArrayException {
        ArrayEntity initialArray = new ArrayEntity(SORTED_ARRAY);
        ArrayEntity expectedArray = new ArrayEntity(SORTED_ARRAY);
        service.sort(initialArray);
        Assert.assertEquals(initialArray, expectedArray);
    }

    @Test
    public void testSort_ThrowsException_EmptyArray() {
        ArrayEntity array = new ArrayEntity(EMPTY_ARRAY);
        Assert.assertThrows(EmptyArrayException.class, () -> service.sort(array));
    }
}
