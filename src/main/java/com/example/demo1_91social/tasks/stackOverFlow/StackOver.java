package com.example.demo1_91social.tasks.stackOverFlow;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StackOver {

    public static void recursivePrint(int num) {

        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }

    public static void main(String[] args) {
        StackOver.recursivePrint(1);
    }
}