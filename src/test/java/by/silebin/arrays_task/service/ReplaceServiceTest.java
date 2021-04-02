package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import by.silebin.arrays_task.service.impl.ReplaceServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReplaceServiceTest {

    private ReplaceService service;
    private static final int[] ARRAY = new int[]{-1, -1, -1, -1};
    private static final int[] RESULT_ARRAY = new int[]{0, 0, 0, 0};
    private static final int[] ARRAY_WITH_NO_REPLACEMENTS = new int[]{1, 1, 1, 1, 1};
    private static final int[] EMPTY_ARRAY = new int[]{};
    private static final int[] RANDOM_ARRAY = new int[]{-1, 2, 3, 4, -1234, 123};
    private static final int[] RANDOM_ARRAY_REPLACED = new int[]{0, 2, 3, 4, 0, 123};

    @BeforeTest
    private void init() {
        service = new ReplaceServiceImpl();
    }

    @Test
    public void testReplaceAllNegativeElementsWithZero() throws EmptyArrayException {
        ArrayEntity initialArray = new ArrayEntity(ARRAY);
        ArrayEntity expectedArray = new ArrayEntity(RESULT_ARRAY);
        service.replaceAllNegativeElementsWithZero(initialArray);
        Assert.assertEquals(initialArray, expectedArray);
    }

    @Test
    public void testReplaceAllNegativeElementsWithZero_NoReplacements() throws EmptyArrayException {
        ArrayEntity initialArray = new ArrayEntity(ARRAY_WITH_NO_REPLACEMENTS);
        ArrayEntity expectedArray = new ArrayEntity(ARRAY_WITH_NO_REPLACEMENTS);
        service.replaceAllNegativeElementsWithZero(initialArray);
        Assert.assertEquals(initialArray, expectedArray);
    }

    @Test
    public void testReplaceAllNegativeElementsWithZero_RandomArray() throws EmptyArrayException {
        ArrayEntity initialArray = new ArrayEntity(RANDOM_ARRAY);
        ArrayEntity expectedArray = new ArrayEntity(RANDOM_ARRAY_REPLACED);
        service.replaceAllNegativeElementsWithZero(initialArray);
        Assert.assertEquals(initialArray, expectedArray);
    }

    @Test
    public void testReplaceAllNegativeElementsWithZero_ThrowsException_EmptyArray() {
        ArrayEntity array = new ArrayEntity(EMPTY_ARRAY);
        Assert.assertThrows(EmptyArrayException.class, () -> service.replaceAllNegativeElementsWithZero(array));
    }
}
