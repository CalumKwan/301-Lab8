package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

public class CustomListTest {
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void getView() {
    }

    @Test
    public void getCount() {
    }

    @Test
    public void addCity() {
    }

    @Test
    public void testGetCount() {
    }

    @Test
    public void testAddCity() {
    }

    @Test
    public void mockCityList() {
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City testCity = new City("Edmonton", "AB");
        list.addCity(testCity);
        assertTrue(list.hasCity(testCity));

        City nonExistentCity = new City("Vancouver", "BC");
        assertFalse(list.hasCity(nonExistentCity));
    }
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City testCity = new City("Edmonton", "AB");
        list.addCity(testCity);
        int listSize = list.getCount();

        list.deleteCity(testCity);
        assertEquals(listSize - 1, list.getCount());
        assertFalse(list.hasCity(testCity));
    }
}
