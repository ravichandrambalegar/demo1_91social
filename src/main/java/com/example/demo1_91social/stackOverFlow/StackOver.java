package com.example.demo1_91social.stackOverFlow;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StackOver {

    public static void recursivePrint(int num) {
        log.info("Number: " + num);

        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }

    public static void main(String[] args) {
        StackOver.recursivePrint(1);
    }
}