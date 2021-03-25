package by.silebin;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.impl.SearchServiceImpl;
import by.silebin.arrays_task.service.exception.NoElementsInArrayException;


public class App 
{
    public static void main( String[] args )
    {
        ArrayEntity arrayEntity = new ArrayEntity(new int[]{});
        SearchServiceImpl searchService = new SearchServiceImpl();
        try {
            System.out.println(searchService.searchMaxValue(arrayEntity));
        } catch (NoElementsInArrayException e) {
            e.printStackTrace();
        }
    }
}
