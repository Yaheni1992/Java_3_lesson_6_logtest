import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)


public class TestMass {

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new int[][][]{
                {{2, 3, 4, 5, 6}, {5, 6}},
                {{5, 4}, {}},
                {{4, 3, 2, 5, 5}, {3, 2, 5, 5}}
        });
    }

    private int[] expectedArr;
    private int[] inArr;

    public TestMass(int[] inArr, int[] expectedArr) {
        this.expectedArr = expectedArr;
        this.inArr = inArr;
    }

    @Test
    public void isNewArrayCorrectlyTookFromInArray() {
        Assertions.assertArrayEquals(expectedArr, MyClass.checkArray(inArr));
    }
}