package lenaBunko.tasks;

import java.util.Arrays;

public class MergingSortedArrays {
    public static int[] mergeArr(int[] firstArr, int[] secondArr) {
        int[] resultArr = new int[firstArr.length + secondArr.length];

        int indFirstArr = 0, indSecondArr = 0, resultIndex = 0;

        while (indFirstArr < firstArr.length && indSecondArr < secondArr.length) {
            if (firstArr[indFirstArr] == secondArr[indSecondArr]) {
                resultArr[resultIndex] = firstArr[indFirstArr];
                resultIndex++;
                resultArr[resultIndex] = secondArr[indSecondArr];
                indFirstArr++;
                indSecondArr++;
            } else {
                resultArr[resultIndex] = Math.min(firstArr[indFirstArr], secondArr[indSecondArr]);
                if (resultArr[resultIndex] == firstArr[indFirstArr]) {
                    indFirstArr++;
                } else {
                    indSecondArr++;
                }
            }
            resultIndex++;
        }

        for (; resultIndex < resultArr.length; resultIndex++) {
            if (indFirstArr < firstArr.length) {
                resultArr[resultIndex] = firstArr[indFirstArr];
                indFirstArr++;
            } else {
                resultArr[resultIndex] = secondArr[indSecondArr];
                indSecondArr++;
            }
        }

        return resultArr;
    }

}

