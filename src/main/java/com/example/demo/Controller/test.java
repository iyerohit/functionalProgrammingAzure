package com.example.demo.Controller;

import com.example.demo.model.Numbers;

public class test {

    public static String getAllNumberSquaredForEach() {

        Numbers.init();

        StringBuilder s = new StringBuilder();
        Numbers.numbers.forEach(x -> s.append(x + " "));

        System.out.println(s.toString());
        return s.toString();

    }

    public static String addValue(int x, String s) {

        s = s + " " + x;
        return s;
    }

    public static void main(String args[]) {

        getAllNumberSquaredForEach();

    }

}
