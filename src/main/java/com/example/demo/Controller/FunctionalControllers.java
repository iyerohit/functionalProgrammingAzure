package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Numbers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FunctionalControllers {

    @RequestMapping("/sum")
    int getSum() {
        Numbers.init();
        int sum = Numbers.numbers.stream().reduce(0, Integer::sum);

        return sum;
    }

    @RequestMapping("/odd")
    List<Integer> getOddNumbers() {
        Numbers.init();
        List<Integer> oddList = Numbers.numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());

        return oddList;
    }

    @RequestMapping("/all")
    List<Integer> getAllNumber() {

        Numbers.init();
        return Numbers.numbers;
    }

    @RequestMapping("/square")
    List<Integer> getAllNumberSquared() {

        Numbers.init();
        List<Integer> squared = Numbers.numbers.stream().map(x -> x * x).collect(Collectors.toList());
        return squared;
    }

    @RequestMapping("/returnString")
    String getAllNumberSquaredForEach() {

        Numbers.init();

        StringBuilder s = new StringBuilder();
        Numbers.numbers.forEach(x -> s.append(x + " "));

        return s.toString();

    }

    @RequestMapping("/cubed")
    List<Integer> getAllNumberCubed() {

        Numbers.init();

        List<Integer> cubed = Numbers.numbers.stream().map(x -> getcubed(x)).collect(Collectors.toList());
        return cubed;

    }

    public String addValue(int x, String s) {

        s = s + x;
        System.out.println(s);
        return s;
    }

    public int getcubed(int x) {

        return x * x * x;

    }
}
