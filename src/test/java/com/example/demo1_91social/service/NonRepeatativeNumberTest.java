package com.example.demo1_91social.service;

import static org.junit.jupiter.api.Assertions.*;


import com.example.demo1_91social.model.BubleSortApiRequest;
import com.example.demo1_91social.model.ReverseStringApiRequest;
import com.example.demo1_91social.serviceImpl.ToDoNonRepeatativeNumber;
import lombok.extern.log4j.Log4j2;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest
public class NonRepeatativeNumberTest {

    private ToDoNonRepeatativeNumber toDoNonRepeatativeNumber;
    private NonRepeatativeNumber nonRepeatativeNumber;

    @Before
    public void setUp() {
         toDoNonRepeatativeNumber = new ToDoNonRepeatativeNumber();
          nonRepeatativeNumber = new NonRepeatativeNumber(toDoNonRepeatativeNumber);
    }

    @Test
    public void nonRepeatativeNumber() {
        BubleSortApiRequest bubleSortApiRequest = new BubleSortApiRequest();
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(10);
        integerList.add(8);
        integerList.add(6);
        integerList.add(6);
        List<Integer> resultList = nonRepeatativeNumber.findNonRepeatativeNumbers(integerList);
        List<Integer> testIntegerList = new ArrayList<Integer>();
        testIntegerList.add(1);
        testIntegerList.add(8);
        testIntegerList.add(10);
        Collections.sort(integerList);
        Collections.sort(resultList);
        Assert.assertEquals(testIntegerList,resultList);

    }
}

