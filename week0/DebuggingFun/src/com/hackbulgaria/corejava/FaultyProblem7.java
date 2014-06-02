package com.hackbulgaria.corejava;

import java.util.Arrays;

//import java.lang.Thread.State;

public class FaultyProblem7 {
    public static int binarySearch(int element, int... array) {
//        Utils.killMeIfIGetStuck();
//        int[] arr = new int[array.length - 1];
//        for(int i = 1; i < array.length; i++) {
//            arr[i - 1] = array[i];
//            System.out.println(array[i]);
//        }
       
        int low = 0;
        int high = array.length - 1;

       
        while (high - low > 1) {
            int mid = (low + high) / 2;
            if (element == array[mid]) {
                return mid;
            }
            if (element < array[mid]) {
                high = mid;
            } else {
                low = mid;
            }
        }

        if (array[high] == element)
            return high;
        if (array[low] == element)
            return low;

        return -1; // not found
    }
}
