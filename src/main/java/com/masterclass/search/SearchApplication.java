package com.masterclass.search;

import com.masterclass.search.basic.BinarySearch;
import com.masterclass.search.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication

public class SearchApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SearchApplication.class);
    public static void main(String[] args) {

        ApplicationContext applicationContext= SpringApplication.run(SearchApplication.class, args);
        //BinarySearch bean  = new BinarySearch(new BubbleSort());


        //BinarySearch bean = applicationContext.getBean(BinarySearch.class);
        //BinarySearch bean2 = applicationContext.getBean(BinarySearch.class);
        //int[] res = bean.binarySearch(new int[]{1,2,3},3);
        PersonDAO p1 = applicationContext.getBean(PersonDAO.class);
        PersonDAO p2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("P1: {}" , p1);
        LOGGER.info("P1: {}",p1.getJdbc());

        LOGGER.info("P2: {}" , p2);
        LOGGER.info("P2: {}",p2.getJdbc());


        //LOGGER.info(Arrays.toString(res));
    }




}

