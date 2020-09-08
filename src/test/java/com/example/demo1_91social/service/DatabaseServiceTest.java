package com.example.demo1_91social.service;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest
class DatabaseServiceTest {

    @Autowired
    DatabaseService databaseService;

    @Test
    public void checkDBOperationSpeed(){
     long ressponseTimeFromDb  = databaseService.doDBOperation();
        long value = 1000;
        assert ressponseTimeFromDb>value:"DataBase Response is too slow";
    }
}