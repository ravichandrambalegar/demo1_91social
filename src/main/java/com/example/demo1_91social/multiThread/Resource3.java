package com.example.demo1_91social.multiThread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Resource3 implements Runnable{
    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    ReentrantReadWriteLock.ReadLock readLock=reentrantReadWriteLock.readLock();

    private Semaphore semaphore;

    public Resource3(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            boolean lockAcquered = readLock.tryLock();
            if (lockAcquered) {
                try {
                    readLock.lock();
                    System.out.println("some process 3");
                    //some process
                } finally {
                    readLock.unlock();
                    semaphore.release();
                }

            }
            else{
                //some other operation
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
