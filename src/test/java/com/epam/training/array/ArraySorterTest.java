package com.epam.training.array;

import org.junit.Test;
import org.junit.Assert;

public class ArraySorterTest {

   
    @Test
    public void testSortShouldSortWhenPositiveNumbers(){
        ArraySorter arraySorter = new ArraySorter();
        Array array = new Array();

        int[] testArray = {1, 3, 5, 6, 3, 3, 4, 4 ,5555, 2, 0, 435, 34, 23,11};
        array.setItems(testArray);
        arraySorter.sort(array);
        testArray = array.getItems();

        boolean result = true;

        for (int i = 0; i < testArray.length - 1; i++){
            if (testArray[i] > testArray[i+1])
                result = false;
        }
        Assert.assertEquals(true, result);
    }

    @Test
    public void shouldSortWhenNegativeNumbers(){
        int[] arrayBox1 = {4, 666, 0, -1, 2, 12435654, 2};
        int[] arrayBox2 = {-1, 0, 2, 2, 4, 666, 12435654};
        Array array1 = new Array(arrayBox1);
        Array array2 = new Array(arrayBox2);
        ArraySorter arraySorter = new ArraySorter();
        arraySorter.sort(array1);

        Assert.assertArrayEquals(array1.getItems(), array2.getItems());
    }
}
