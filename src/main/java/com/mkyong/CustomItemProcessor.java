package com.mkyong;

import org.springframework.batch.item.ItemProcessor;
import com.mkyong.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

    public Report process(Report item) throws Exception {


        System.out.println("Processing..." + item);
//        if (item.getId() == 1003) {
//            throw new IllegalArgumentException();
////        return item;
//        }
        return item;
    }

}