package com.example.demo1_91social.service;

import com.example.demo1_91social.model.ReverseStringApiRequest;
import lombok.extern.log4j.Log4j2;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReverseSStringServiceTest {
    @Autowired
    ReverseSStringService reverseSStringService;

    @Test
    public void reverseString(){
        ReverseStringApiRequest reverseStringApiRequest = new ReverseStringApiRequest();
        reverseStringApiRequest.setUserString("ravi");
        String reversedString=reverseSStringService.makeStringReverse(reverseStringApiRequest.getUserString());
        assertTrue(reversedString.equals("ivar"));
    }
}
