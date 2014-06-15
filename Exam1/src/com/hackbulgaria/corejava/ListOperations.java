package com.hackbulgaria.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> copyOfList = new ArrayList<>();
        for (Integer element : list) {
            copyOfList.add(element);
        }
        Collections.sort(copyOfList);

        return copyOfList;
    }

    public static List<Integer> reverse(List<Integer> list) {
        List<Integer> copyOfList = new ArrayList<>();
        for (Integer element : list) {
            copyOfList.add(element);
        }
        Collections.reverse(copyOfList);

        return copyOfList;
    }

    public static boolean isMonotonous(List<Integer> list) {
        return list.equals(sort(list)) || list.equals(reverse(sort(list)));
    }

}
