
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MyClassTest {

    @Test
    public void test1CheckedInArray4() {
        int[] ints = new int[]{1, 3, 4, 7, 5, 6, 3};
        int[] in = new int[]{7, 5, 6, 3};
        Assertions.assertArrayEquals(in, MyClass.checkArray(ints));
    }

    @Test
    public void test2CheckedInArray4() throws Exception {
        int[] ints = new int[]{2, 3, 7, 3, 8, 9};
        Assertions.assertThrows(RuntimeException.class, () -> {
            MyClass.checkArray(ints);
        });
    }

    @Test
    public void test3checkArray2() throws Exception {
        int[] ints = new int[]{1, 7, 3, 4, 9};
        Assertions.assertFalse(MyClass.checkArray2(ints));
    }

    @Test
    public void test4checkArray2() throws Exception {
        int[] ints = new int[]{4, 4, 1, 1};
        Assertions.assertTrue(MyClass.checkArray2(ints));
    }
}

