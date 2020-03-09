package rocks.zipcode.io.quiz3.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        if(inputArray.length != squaredValues.length)
            return false;

        Set<Integer> SQset = new HashSet<>();

        for(Integer in:squaredValues){
            SQset.add((int) Math.sqrt(in));
        }

        for(Integer in:inputArray){
            if(!SQset.contains(in))
                return false;
        }
//        boolean flag = true;
//        if( squaredValues[0] == inputArray[squaredValues.length-1]*inputArray[squaredValues.length-1]) {
//            //check special condition
//            for (int i = 1; i < squaredValues.length; i++) {
//                if(squaredValues[i] != inputArray[i-1]*inputArray[i-1]){
//                    return false;
//                }
//            }
//        }else {
//            for (int i = 0; i < squaredValues.length; i++) {
//                if (squaredValues[i] != inputArray[i] * inputArray[i])
//                    return false;
//            }
//        }
        return true;
    }
}
