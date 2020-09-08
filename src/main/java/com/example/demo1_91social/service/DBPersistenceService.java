package com.example.demo1_91social.service;


import com.example.demo1_91social.model.Customers;
import com.example.demo1_91social.repository.DBRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Log4j2
@Service
public class DBPersistenceService {
    long  timeTakenToExecuteQuery;
    @Autowired
    private DBRepo dbRepo;
    @Transactional
    public long getResponseFromDB() {

        try {
            long startTime=System.currentTimeMillis();
            List<Customers> customers = dbRepo.performDBOPeration();
            long endTime=System.currentTimeMillis();
            timeTakenToExecuteQuery= (endTime-startTime);
        }
        catch (Exception e){

        }
        return timeTakenToExecuteQuery;
    }
}
