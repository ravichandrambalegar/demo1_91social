package com.example.demo1_91social.looseCoupling;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ByWalk implements Travel {
    public void go(){
        log.info("travelling By Walk");
    }
}