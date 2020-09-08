package com.example.demo1_91social.service;

import com.example.demo1_91social.serviceImpl.ToDoStringReverse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class ReverseSStringService {

    @Autowired
    ToDoStringReverse toDoStringReverse ;

    public ReverseSStringService(ToDoStringReverse toDoStringReverse) {
        this.toDoStringReverse = toDoStringReverse;
    }

    public String makeStringReverse(String userString) {
        return toDoStringReverse.doStringReverse(userString);
    }
}
