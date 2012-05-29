package com.jayway.nojavacannot;

import java.util.Arrays;
import java.util.Collection;

public class RangeFinder {

    /**
     * Find min and max value in integer collection.
     * @param c
     * @return array of two (not compile checked)
     */
    public int[] findMinMax(Collection<Integer> c) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : c) {
            if (max <  i) {
                max = i;
            }
            if (min > i){
                min = i;
            }
        }
        return new int[] {min,max};
    }

/*
    public static void main(String[] args) {
        RangeFinder rf = new RangeFinder();
        int[] res = rf.findMinMax(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        System.out.println(res[0] + "," + res[1]);
    }
*/
}
