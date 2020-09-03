package com.example.demo1_91social.service;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service
public class BubbleSortService {
    public List<Integer> bubbleSort(List<Integer> array) {
        int[] arr = array.stream().mapToInt(i->i).toArray();
        try {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } catch (Exception e) {
        }
        List<Integer> intList = new ArrayList<Integer>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            intList.add(arr[i]);
        }
        return intList;
    }
}
