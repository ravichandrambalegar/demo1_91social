package com.example.demo1_91social.service;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class ReverseSStringService {
    public String makeStringReverse(String userString){
        try {
            if (userString.isEmpty())
                return userString;
            return makeStringReverse(userString.substring(1)) + userString.charAt(0);

        }
        catch (Exception e){
        }
        return userString;
    }
}
