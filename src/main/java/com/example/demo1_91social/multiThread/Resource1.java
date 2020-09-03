package com.example.demo1_91social.multiThread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Resource1 implements Runnable {
    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
    private Semaphore semaphore;

    public Resource1(Semaphore semaphore) {
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
                    System.out.println("some process 1");
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
