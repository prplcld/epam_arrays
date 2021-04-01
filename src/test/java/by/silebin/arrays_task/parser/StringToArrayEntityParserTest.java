package by.silebin.arrays_task.parser;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.parser.impl.StringToArrayEntityParserImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StringToArrayEntityParserTest {
    private static final String STRING_ARRAY = "1 2 3 4";
    private static final int[] ARRAY = new int[]{1, 2, 3, 4};
    private StringToArrayEntityParser parser;

    @BeforeTest
    private void init(){
        parser = new StringToArrayEntityParserImpl();
    }

    @Test
    public void testCreateFromString(){
        ArrayEntity expected = new ArrayEntity(ARRAY);
        Assert.assertEquals(parser.parse(STRING_ARRAY), expected);
    }
}
