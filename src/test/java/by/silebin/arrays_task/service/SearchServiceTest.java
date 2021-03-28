package by.silebin.arrays_task.service;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.exception.EmptyArrayException;
import by.silebin.arrays_task.service.impl.SearchServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchServiceTest {

    private SearchService service;

    private static final int[] EMPTY_ARRAY = new int[]{};
    private static final int[] ONES_ARRAY = new int[]{1, 1, 1, 1};
    private static final int[] RANDOM_ARRAY = new int[]{87, 40, -47, 63, -34};

    @BeforeTest
    private void init(){
        service = new SearchServiceImpl();
    }

    @Test
    public void testSearchMaxValue_RandomArray() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(RANDOM_ARRAY);
        Assert.assertEquals(service.searchMaxValue(array), 87);
    }

    @Test
    public void testSearchMaxValue_OnesArray() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(ONES_ARRAY);
        Assert.assertEquals(service.searchMaxValue(array), 1);
    }

    @Test
    public void testSearchMaxValue_ThrowsException_EmptyArray()  {
        ArrayEntity array = new ArrayEntity(EMPTY_ARRAY);
        Assert.assertThrows(EmptyArrayException.class, () -> service.searchMaxValue(array));
    }

    @Test
    public void testSearchMinValue_RandomArray() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(RANDOM_ARRAY);
        Assert.assertEquals(service.searchMinValue(array), -47);
    }

    @Test
    public void testSearchMinValue_OnesArray() throws EmptyArrayException {
        ArrayEntity array = new ArrayEntity(ONES_ARRAY);
        Assert.assertEquals(service.searchMinValue(array), 1);
    }

    @Test
    public void testSearchMinValue_ThrowsException_EmptyArray()  {
        ArrayEntity array = new ArrayEntity(EMPTY_ARRAY);
        Assert.assertThrows(EmptyArrayException.class, () -> service.searchMinValue(array));
    }
}
