package com.example.demo1_91social.deadlock;

import com.example.demo1_91social.looseCoupling.Journey;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThreadDeadLock {
    public static Journey journey_object1=new Journey();
    public static Journey journey_object2=new Journey();

    public static void main(String[] args) {
        Thread t1= new Thread(){
            public void run(){
                synchronized (journey_object1){
                    log.info(" Thread t1 locked journey_object1");
                    log.info("Thread t1 waiting for journey_object2");
                    synchronized (journey_object2){
                        log.info("Thread t1 locked by journey_object2 and journey_object1");

                    }

                }
            }
        };
        Thread t2= new Thread(){
            public void run(){
                synchronized (journey_object2){
                    log.info("Thread t2 locked journey_object2");
                    log.info("t1 waiting for journey_object1");

                    synchronized (journey_object1){
                        log.info("Thread t1 locked by journey_object1 and journey_object2");

                    }

                }
            }
        };
    }
}
