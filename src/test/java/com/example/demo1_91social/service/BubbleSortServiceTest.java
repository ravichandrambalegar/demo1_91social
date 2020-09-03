package com.example.demo1_91social.service;

import com.example.demo1_91social.model.BubleSortApiRequest;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest
public class BubbleSortServiceTest {
    @Autowired
    BubbleSortService bubbleSortService;

    @Test
    public void bubbleSort(){
        BubleSortApiRequest bubleSortApiRequest = new BubleSortApiRequest();
        List<Integer> integerList=new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(10);
        integerList.add(8);
        integerList.add(6);
        bubleSortApiRequest.setIntArray(integerList);
        List<Integer> reversedArray=bubbleSortService.bubbleSort(bubleSortApiRequest.getIntArray());
        List<Integer> testIntegerList=new ArrayList<Integer>();
        testIntegerList.add(1);
        testIntegerList.add(6);
        testIntegerList.add(8);
        testIntegerList.add(10);
        assertTrue(reversedArray.equals(testIntegerList));
    }
}