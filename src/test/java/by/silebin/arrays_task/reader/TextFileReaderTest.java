package by.silebin.arrays_task.reader;

import by.silebin.arrays_task.reader.exception.NoValidDataException;
import by.silebin.arrays_task.reader.impl.TextFileReaderImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextFileReaderTest {

    private static final String FILENAME = "data.txt";
    private static final String EMPTY_FILE_FILENAME = "empty.txt";
    private static final String NOT_EXISTING_FILE = "not_existing.txt";
    private static final String EXPECTED_RESULT_FROM_DATA_TXT = "1 2 -3 4 -5";
    private TextFileReader fileReader;

    @BeforeTest
    private void init() {
        fileReader = new TextFileReaderImpl();
    }

    @Test
    public void testReadFile() throws NoValidDataException {
        Assert.assertEquals(fileReader.readFile(FILENAME), EXPECTED_RESULT_FROM_DATA_TXT);
    }

    @Test
    public void testReadFile_ThrowsException_EmptyFile() {
        Assert.assertThrows(NoValidDataException.class, () -> fileReader.readFile(EMPTY_FILE_FILENAME));
    }

    @Test
    public void testReadFile_ThrowsException_NoFile() {
        Assert.assertThrows(NullPointerException.class, () -> fileReader.readFile(NOT_EXISTING_FILE));
    }
}
