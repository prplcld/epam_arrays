package by.silebin.arrays_task.creator;

import by.silebin.arrays_task.creator.impl.ArrayCreatorImpl;
import by.silebin.arrays_task.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayCreatorTest {

    private static final String STRING_ARRAY = "1 2 3 4";
    private static final int[] ARRAY = new int[]{1, 2, 3, 4};
    private ArrayCreator arrayCreator;

    @BeforeTest
    private void init(){
        arrayCreator = new ArrayCreatorImpl();
    }

    @Test
    public void testCreateFromString(){
        ArrayEntity expected = new ArrayEntity(ARRAY);
        Assert.assertEquals(arrayCreator.createFromString(STRING_ARRAY), expected);
    }
}
