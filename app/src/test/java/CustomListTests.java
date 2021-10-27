import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTests {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    /**
     * used to test add
     */
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    /**
     * used to test has
     */
    public void hasCityTest(){
        City newCity = new City("Halifax", "NS");
        list.addCity(newCity);
        assertTrue(list.hasCity(newCity));
    }

    @Test
    /**
     * used to test deletion
     */
    public void deleteCityTest(){
        int listSize = list.getCount();
        City newCity = new City("Halifax", "NS");
        list.addCity(newCity);
        assertEquals(list.getCount(), listSize+1);
        assertTrue(list.deleteCity(newCity));
        assertEquals(list.getCount(), listSize);
    }

    @Test
    /**
     * used to test count
     */
    public void countCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.countCities(), listSize+1);
        list.addCity(new City("Toronto", "ON"));
        assertEquals(list.countCities(), listSize+2);
    }
}
