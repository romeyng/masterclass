package com.masterclass.search.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlg{

    public int[] sort(int[] numbers) {
        System.out.println("sort via quick sort");
        return numbers;

    }
}
