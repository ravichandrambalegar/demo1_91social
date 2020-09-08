package com.example.demo1_91social.tasks.looseCoupling;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Car implements Travell {
    public void go(){
        log.info("travelling By Car");
    }
}