package challenges;

import java.util.Arrays;

public class ArrayShiftLibrary {

    /**
     * Add given value to mid of array
     *
     * @param input      int array
     * @param valuetoAdd valuetoAdd
     * @return array
     * shiftedArray
     */
    public static int[] insertShiftArray(int[] inputIntArray, int valueToAdd) {

        int inputArrayLength = inputIntArray.length ;
        int j = 0;
        int[] shiftedArray = new int[inputArrayLength + 1];

        for (int i = 0; i < inputIntArray.length; i++) {
            j = (int) (inputArrayLength / 2);
            if (i ==  j ) {
                shiftedArray[i] = valueToAdd;
                j = j+1;
                shiftedArray[j] = inputIntArray[i];
            } else if(i > j){
                shiftedArray[i+1] = inputIntArray[i];
            } else {
                shiftedArray[i] = inputIntArray[i];
            }
        }

        System.out.println("After Shifting :" + Arrays.toString(shiftedArray));

        return shiftedArray;
    }
}

