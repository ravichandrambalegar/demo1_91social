package com.example.demo1_91social.service;

import static org.junit.jupiter.api.Assertions.*;


import com.example.demo1_91social.model.BubleSortApiRequest;
import com.example.demo1_91social.model.ReverseStringApiRequest;
import lombok.extern.log4j.Log4j2;
import lombok.extern.log4j.Log4j2;
import org.junit.Ignore;
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
public  class NonRepeatativeNumberTest {
    @Autowired
    NonRepeatativeNumber nonRepeatativeNumberService;

    @Test
    public void nonRepeatativeNumber(){
        BubleSortApiRequest bubleSortApiRequest = new BubleSortApiRequest();
        List<Integer> integerList=new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(10);
        integerList.add(8);
        integerList.add(6);
        integerList.add(6);
        bubleSortApiRequest.setIntArray(integerList);
        List<Integer> resultList=nonRepeatativeNumberService.checkNonRepeatativeNumber(bubleSortApiRequest.getIntArray());
        List<Integer> testIntegerList=new ArrayList<Integer>();
        testIntegerList.add(1);
        testIntegerList.add(8);
        assertTrue(resultList.containsAll(testIntegerList));
    }
}

