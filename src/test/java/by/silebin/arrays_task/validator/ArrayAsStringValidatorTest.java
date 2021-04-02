package by.silebin.arrays_task.validator;


import by.silebin.arrays_task.validator.impl.ArrayAsStringValidatorImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayAsStringValidatorTest {

    private ArrayAsStringValidator validator;
    private static final String VALID_DATA = "12134 2 -3 422";
    private static final String INVALID_DATA = "1z 2 3 4";
    private static final String VALID_DATA_WITH_SPACES = "1   333   -44567         -51    ";

    @BeforeTest
    private void init() {
        validator = new ArrayAsStringValidatorImpl();
    }

    @Test
    public void testIsValid_True_ValidData() {
        String data = VALID_DATA;
        boolean result = validator.isValid(data);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsValid_False_InvalidData() {
        String data = INVALID_DATA;
        boolean result = validator.isValid(data);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsValid_True_ValidDataWithSpaces() {
        String data = VALID_DATA_WITH_SPACES;
        boolean result = validator.isValid(data);
        Assert.assertTrue(result);
    }
}
