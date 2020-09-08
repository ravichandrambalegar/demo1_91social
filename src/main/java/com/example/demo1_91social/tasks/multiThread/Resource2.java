package com.example.demo1_91social.tasks.multiThread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Resource2 implements Runnable{

    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    ReentrantReadWriteLock.WriteLock writeLock=reentrantReadWriteLock.writeLock();
    private Semaphore semaphore;

    public Resource2(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            boolean lockAcquered = writeLock.tryLock();
            if (lockAcquered) {
                try {
                    writeLock.lock();
                    //some process
                } finally {
                    writeLock.unlock();
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

