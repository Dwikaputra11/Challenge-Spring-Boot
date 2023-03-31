package com.challenge.chapter3.school_grade;

import java.util.Collection;
import java.util.List;

public interface Calculation {
    double getMean();

    String getModus();

    String getMedian();

    // penerapan fitur Java 8
    default List<String> sortAsNumbers(Collection<String> collection) {
        return collection
                .stream()
                .map(Integer::valueOf)
                .sorted()
                .map(String::valueOf)
                .toList();
    }
}
