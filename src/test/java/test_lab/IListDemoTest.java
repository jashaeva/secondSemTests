package test_lab;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static test_lab.ListDemo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class IListDemoTest {
    @DataProvider
    public static Object[][] stringsSet() {
        return new Object[][]{
                {Arrays.asList(new String[]{"abc", "abcc", "werty", "atyu"}), 'a', 3},
                {Arrays.asList(new String[]{"abc", "abcc", "werty", "atyu"}), 'w', 1},
                {Arrays.asList(new String[]{"cc", " abcc", "werty", " atyu"}), ' ', 2},
                {Arrays.asList(new String[]{"cc", " abcc", "werty", " atyu"}), 'W', 0},
                {new ArrayList<String>(), 'W', 0},
                {new ArrayList<String>(), ' ', 0}
        };
    }

    @Test(dataProvider = "stringsSet")
    public void testCountOfStrings(List<String> list, char c, int expected) {
        assertEquals(countOfString(list, c), expected);
 }
}
