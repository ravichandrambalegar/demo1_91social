package com.example.demo1_91social.tasks.deadlock;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThreadDeadLock {

    static String obj1 = "String1";
    static String obj2 = "String2";

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (obj1) {
                    synchronized (obj2) {
                        log.info("Thread t1 locked by object2 and journey_object1");
                    }

                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (obj2) {
                    synchronized (obj1) {
                        log.info("Thread t1 locked by object1 and object2");

                    }

                }
            }
        };
    }
}
