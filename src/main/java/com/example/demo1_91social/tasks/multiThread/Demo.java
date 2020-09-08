package com.example.demo1_91social.tasks.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        Semaphore semaphore= new Semaphore(3);
        executorService.execute(new Resource1(semaphore));
        executorService.execute(new Resource2(semaphore));
        executorService.execute(new Resource3(semaphore));
        executorService.shutdown();

    }
}