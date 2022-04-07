import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(checkArray(new int[] {1,2, 4, 4, 2, 3, 4, 1, 7})));
//        System.out.println(Arrays.toString(checkArray(new int[] {1, 2, 4, 4, 2, 4})));
//        System.out.println(Arrays.toString(checkArray(new int[] {1, 2, 4, 4, 1, 7, 5, 6, 1})));
//        System.out.println(Arrays.toString(checkArray(new int[] {1, 2, 1, 7, 444, 44, 14})));


//        System.out.println(checkArray2(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
//        System.out.println(checkArray2(new int[]{1, 1, 1, 1, 1, 1}));
//        System.out.println(checkArray2(new int[]{4, 4, 4, 4 }));
//        System.out.println(checkArray2(new int[]{1, 4, 4, 1, 1, 4, 3}));



    }
    public static int[] checkArray(int[] inArr) throws RuntimeException {
        int pos4 = -1;
        for (int i = inArr.length - 1; i >= 0; i--) {
            if (inArr[i] == 4) {
                pos4 = i;
                break;
            }
        }
        if (pos4 == -1) {
            throw new RuntimeException("Массив без 4");
        } else {
            return Arrays.copyOfRange(inArr, pos4 + 1, inArr.length);
        }
    }

    public static boolean checkArray2(int[] arr) {
        boolean has1, has4 = false;
        has1 = has4 = false;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4) {
                return false;
            }
            if (arr[i] == 1) {
                has1 = true;
            }
            if (arr[i] == 4) {
                has4 = true;
            }
        }
        return has1 && has4;
    }
}

