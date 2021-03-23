package by.silebin;

import by.silebin.arrays_task.entity.ArrayEntity;
import by.silebin.arrays_task.service.SearchService;


public class App 
{
    public static void main( String[] args )
    {
        ArrayEntity arrayEntity = new ArrayEntity(new int[]{});
        SearchService searchService = new SearchService();
        System.out.println(searchService.searchMaxValue(arrayEntity));
    }
}
