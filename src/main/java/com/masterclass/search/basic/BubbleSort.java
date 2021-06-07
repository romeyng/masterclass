package com.masterclass.search.basic;

import org.springframework.stereotype.Component;

@Component

public class BubbleSort implements SortAlg{

    public int[] sort(int[] numbers) {
        System.out.println("sort via bubble sort");
        return numbers;

    }
}
