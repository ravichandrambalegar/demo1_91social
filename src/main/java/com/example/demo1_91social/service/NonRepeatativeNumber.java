package com.example.demo1_91social.service;


import com.example.demo1_91social.configuration.SocketConfiguration;
import com.example.demo1_91social.serviceImpl.ToDoNonRepeatativeNumber;
import com.example.demo1_91social.serviceImpl.ToDoStringReverse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log4j2
@Service
public class NonRepeatativeNumber {

    @Autowired
    ToDoNonRepeatativeNumber toDoNonRepeatativeNumber ;

    @Autowired
    SocketConfiguration socketConfiguration;

    public NonRepeatativeNumber(ToDoNonRepeatativeNumber toDoNonRepeatativeNumber) {
        this.toDoNonRepeatativeNumber = toDoNonRepeatativeNumber;
    }

    public List<Integer> findNonRepeatativeNumbers(List<Integer> array) {
        return toDoNonRepeatativeNumber.checkNonRepeatativeNumber(array);
    }

}
