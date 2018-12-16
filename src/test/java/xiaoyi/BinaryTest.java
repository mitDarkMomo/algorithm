package xiaoyi;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryTest {
    
    int[] a;
    int[] nul = {};

    @Before
    public void beforeEach() {
        int[] b = {1,2,3,3,4,5,6,7,8,9};
        a = b;
    }

    @Test
    public void find1Test() {
        int index = Binary.find1(a, a.length, 3);
        assertEquals(2, index);

        int index1 = Binary.find1(nul, nul.length, 3);
        assertEquals(-1, index1);
    }

    @Test
    public void find2Test() {
        int index = Binary.find2(a, a.length, 3);
        assertEquals(3, index);

        int index1 = Binary.find1(nul, nul.length, 3);
        assertEquals(-1, index1);
    }

    @Test
    public void find3Test() {
        int index = Binary.find3(a, a.length, 5);
        assertEquals(5, index);

        int index1 = Binary.find3(nul, nul.length, 3);
        assertEquals(-1, index1);
    }

    @Test
    public void find4Test() {
        int index = Binary.find4(a, a.length, 5);
        assertEquals(5, index);

        int index1 = Binary.find4(nul, nul.length, 3);
        assertEquals(-1, index1);
    }
}