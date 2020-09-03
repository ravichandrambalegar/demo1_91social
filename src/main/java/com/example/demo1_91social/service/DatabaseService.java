package com.example.demo1_91social.service;

import com.example.demo1_91social.model.Customers;
import com.example.demo1_91social.repository.DBRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Log4j2
@Service
public class DatabaseService {
    @Autowired
    private DBPersistenceService dbPersistenceService;

    @Autowired
    private DBRepo dbRepo;

    long timeInMilliSec;
    public long doDBOperation() {
        try {
            timeInMilliSec= dbPersistenceService.getResponseFromDB();

        } catch (Exception e) {
        }
        return timeInMilliSec;
    }


    public String insertRecords(int count) {
        try {
            for(int i=1;i<count;i++){
                Customers  customers = new Customers();
                customers.setFirst_name("ravi");
                customers.setLast_name("mb");
                customers.setContact(getRandomNumber());
                customers.setContact(getRandomNumber());
                System.out.println("DB insert response:::"+getRandomNumber());

                Customers customers1= dbRepo.save(customers);
                System.out.println("DB insert response:::"+customers1.getContact());
            }


        } catch (Exception e) {
        }
        return "success";
    }

    protected String getRandomString() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String s = salt.toString();
        return s;

    }
    protected String getRandomNumber() {
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String contact = salt.toString();
        return contact;

    }


}
