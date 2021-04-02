package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import by.silebin.arrays_task.service.impl.AverageValueServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AverageValueServiceTest {

    private AverageValueService service;
    private static final int[] ARRAY = new int[]{1, -1, 3};
    private static final int[] EMPTY_ARRAY = new int[]{};
    private static final int[] ARRAY_OF_MAX_INTEGER = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};

    @BeforeTest
    private void init() {
        service = new AverageValueServiceImpl();
    }

    @Test
    public void testCountAverageValue() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(ARRAY);
        double result = service.countAverageValue(array);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void testCountAverageValue_ThrowsException_EmptyArray() {
        ArrayEntity array = new ArrayEntity(EMPTY_ARRAY);
        Assert.assertThrows(EmptyArrayException.class, () -> service.countAverageValue(array));
    }

    @Test
    public void testCountAverageValue_IntegerMaxValue_ArrayOfMaxIntegers() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(ARRAY_OF_MAX_INTEGER);
        double result = service.countAverageValue(array);
        Assert.assertEquals(result, Integer.MAX_VALUE);
    }
}
