package by.silebin;

import by.silebin.arrays_task.creator.ArrayCreator;
import by.silebin.arrays_task.creator.impl.ArrayCreatorImpl;
import by.silebin.arrays_task.reader.TextFileReader;
import by.silebin.arrays_task.reader.impl.TextFileReaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    public static final Logger LOGGER = LogManager.getLogger(App.class.getName());

    public static void main( String[] args ) {
        TextFileReader fileReader = new TextFileReaderImpl();
        ArrayCreator arrayCreator = new ArrayCreatorImpl();
        try {
            String str = fileReader.readFile("data.txt");
            int[] arr = arrayCreator.createFromString(str).getArray();
            for(int i : arr){
                LOGGER.info(i);
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
