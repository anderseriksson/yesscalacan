package com.jayway.nojavacannot;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Anders Eriksson.
 * TODO demo a call from Scala to Java code. (No need for Maven project, this can be done with sbt)
 */
public class RangeFinder {

    /**
     * TODO Change method to both return min and max...
     * @param c
     * @return
     */
    public Integer findMinMax(Collection<Integer> c) {
//        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        for (Integer i : c) {
            if (max <  i) {
                max = i;
            }
//            if (min > i){
//                min = i;
//            }
        }
        return max;
    }

    public static void main(String[] args) {
        RangeFinder rf = new RangeFinder();
        System.out.println(rf.findMinMax(Arrays.asList(new Integer[]{1, 2, 3, 4})));
    }
}
