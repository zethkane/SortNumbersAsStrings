import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class TestSorter {

    @Test
    public void testNumbersLessThanTen(){
        String[] test = new String[]{"9", "3", "2", "7", "1"};
        String[] actual = ArraySorter.sortThisArray(test);
        String[] expected = new String[]{"1", "2", "3","7","9"};

        Assert.assertArrayEquals(actual,expected);

    }

    @Test
    public void testAllNumbers(){
        String[] test = new String[]{"9", "3", "2", "7", "1", "11","14","13", "22"};
        String[] actual = ArraySorter.sortThisArray(test);
        String[] expected = new String[]{"1","2","3","7","9","11","13","14","22"};

        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void testAllNumbersAsNames(){
        String[] test = new String[]{"nine", "three", "two", "seven", "one", "eleven","fourteen","thirteen", "twenty-two"};
        String[] actual = ArraySorter.sortThisArray(test);
        String[] expected = new String[]{"one","two","three","seven","nine","eleven","thirteen","fourteen","twenty-two"};

        Assert.assertArrayEquals(actual, expected);

        //Will be using regex to check each entry, if it was to convert to the number ex ("nine" -> "9") would hardcode each if statement unless there was a library already made to by someone to do so.
        //Will see if regex will work with the keeping them in word form.
    }
}
