package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import by.silebin.arrays_task.service.impl.CounterServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CounterServiceTest {

    private CounterService service;
    private static final int[] ARRAY_OF_NEGATIVES = new int[]{-1, -1, -1, -1, -1};
    private static final int[] ARRAY_OF_POSITIVES = new int[]{1, 1, 1, 1, 1, 1};
    private static final int[] EMPTY_ARRAY = new int[]{};

    @BeforeTest
    private void init() {
        service = new CounterServiceImpl();
    }

    @Test
    public void testCountPositive_ArrayOfPositives() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(ARRAY_OF_POSITIVES);
        Assert.assertEquals(service.countPositive(array), 6);
    }

    @Test
    public void testCountPositive_ArrayOfNegatives() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(ARRAY_OF_NEGATIVES);
        Assert.assertEquals(service.countPositive(array), 0);
    }

    @Test
    public void testCountPositive_ThrowsException_EmptyArray() {
        ArrayEntity array = new ArrayEntity(EMPTY_ARRAY);
        Assert.assertThrows(EmptyArrayException.class, () -> service.countPositive(array));
    }

    @Test
    public void testCountNegative_ArrayOfPositives() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(ARRAY_OF_POSITIVES);
        Assert.assertEquals(service.countNegative(array), 0);
    }

    @Test
    public void testCountNegative_ArrayOfNegatives() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(ARRAY_OF_NEGATIVES);
        Assert.assertEquals(service.countNegative(array), 5);
    }

    @Test
    public void testCountNegative_ThrowsException_EmptyArray() {
        ArrayEntity array = new ArrayEntity(EMPTY_ARRAY);
        Assert.assertThrows(EmptyArrayException.class, () -> service.countNegative(array));
    }
}
