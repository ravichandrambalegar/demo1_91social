package com.example.demo1_91social.service;


import com.example.demo1_91social.serviceImpl.ToDoBubbleSort;
import com.example.demo1_91social.serviceImpl.ToDoNonRepeatativeNumber;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service
public class BubbleSortService {

    @Autowired
    ToDoBubbleSort toDoBubbleSort ;

    public BubbleSortService(ToDoBubbleSort toDoBubbleSort) {
        this.toDoBubbleSort = toDoBubbleSort;
    }

    public List<Integer> bubbleSort(List<Integer> array) {
        return toDoBubbleSort.doBubbleSort(array);
    }
}
