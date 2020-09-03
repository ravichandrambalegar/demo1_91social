package com.example.demo1_91social.service;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Log4j2
@Service
public class AlternativePosAndNegNumber {
    public List<Integer> reArrangePosAndNegNumber(List<Integer> arr) {
        int[] a = arr.stream().mapToInt(i->i).toArray();
        List<Integer> list = new ArrayList<Integer>();
        int size=a.length;
        int positive = 0, negative = 1, temp;
        while (true) {
            while (positive < size && a[positive] >= 0)
                positive += 2;
            while (negative < size && a[negative] <= 0)
                negative += 2;

            if (positive < size && negative < size) {
                temp = a[positive];
                a[positive] = a[negative];
                a[negative] = temp;
            }
            else
                break;
        }
        for (int t : a) {
            list.add(t);
        }
        return list;
    }


}
