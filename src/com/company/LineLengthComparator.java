package com.company;

import java.util.Comparator;

public class LineLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        Integer i1 = o1.length();
        Integer i2 = o2.length();
        return i1.compareTo(i2);
    }
}