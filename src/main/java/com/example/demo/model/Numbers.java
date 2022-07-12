package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public static List<Integer> numbers = new ArrayList<Integer>();

    public static void init() {
        numbers = List.of(1, 4, 12, 34, 32, 5, 67, 4, 18, 39);
    }

}
