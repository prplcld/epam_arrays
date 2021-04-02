package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import by.silebin.arrays_task.service.impl.SumServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SumServiceTest {

    private SumService service;

    private static final int[] EMPTY_ARRAY = new int[]{};
    private static final int[] ZEROS_ARRAY = new int[]{0, 0, 0, 0};
    private static final int[] RANDOM_ARRAY = new int[]{48, 89, 26, 3};

    @BeforeTest
    private void init() {
        service = new SumServiceImpl();
    }

    @Test
    public void testSum_RandomArray() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(RANDOM_ARRAY);
        Assert.assertEquals(service.sum(array), 166);
    }

    @Test
    public void testSum_ZerosArray() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(ZEROS_ARRAY);
        Assert.assertEquals(service.sum(array), 0);
    }

    @Test
    public void testSum_ThrowsException_EmptyArray() {
        ArrayEntity array = new ArrayEntity(EMPTY_ARRAY);
        Assert.assertThrows(EmptyArrayException.class, () -> service.sum(array));
    }
}
