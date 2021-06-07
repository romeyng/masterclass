package com.masterclass.search.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {


    @Autowired

    private SortAlg sortAlg;

    public void setSortAlg(SortAlg sortAlg) {
        this.sortAlg = sortAlg;
    }
//Constructor not necessary with autowired
//    public BinarySearch(SortAlg sortAlg) {
//        super();
//        this.sortAlg = sortAlg;
//    }

    public int[] binarySearch(int [] numbers, int num){
        int[] sorted = sortAlg.sort(numbers) ;

    return sorted;
    }
}
