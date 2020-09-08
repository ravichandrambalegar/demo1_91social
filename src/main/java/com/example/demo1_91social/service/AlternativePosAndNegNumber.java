package com.example.demo1_91social.service;


import com.example.demo1_91social.serviceImpl.ToDoAlternativePosAndNegNumber;
import com.example.demo1_91social.serviceImpl.ToDoBubbleSort;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Log4j2
@Service
public class AlternativePosAndNegNumber {
    @Autowired
    ToDoAlternativePosAndNegNumber toDoAlternativePosAndNegNumber ;

    public AlternativePosAndNegNumber(ToDoAlternativePosAndNegNumber toDoAlternativePosAndNegNumber) {
        this.toDoAlternativePosAndNegNumber = toDoAlternativePosAndNegNumber;
    }

    public List<Integer> reArrangePosAndNegNumber(List<Integer> array) {
        return toDoAlternativePosAndNegNumber.doReArrangePosAndNegNumber(array);
    }

}
