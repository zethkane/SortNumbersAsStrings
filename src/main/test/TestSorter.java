import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class TestSorter {

    @Test
    public void testNumbersLessThanTen(){
        String[] test = new String[]{"9", "3", "2", "7", "1"};
        String[] actual = ArraySorter.sortThisArray(test);
        String[] expected = new String[]{"1", "2", "3","7","9"};

        Assert.assertEquals(actual,expected);

    }


}
