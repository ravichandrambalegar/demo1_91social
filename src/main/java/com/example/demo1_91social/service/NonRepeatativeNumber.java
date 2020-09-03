package com.example.demo1_91social.service;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log4j2
@Service
public class NonRepeatativeNumber {

    public  List<Integer> checkNonRepeatativeNumber(List<Integer> array)
    {
        List<Integer> intList = new ArrayList<Integer>();
        int[] arr = array.stream().mapToInt(i->i).toArray();
        int count;
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            count=0;
            for (int j = 0; j < n; j++)
            {

                if(arr[i]==arr[j] && i!=j)
                    count++;
            }
            if(count==0)
                intList.add(arr[i]);
        }
       return intList;
    }

    /*static public List<Integer> reorder(List<Integer>  list) {
      //  int[] input = list.stream().mapToInt(i->i).toArray();
        List<Integer> list1 = new ArrayList<Integer>();

        int[] input = {8,-2,3,9,5,-6,7,1,4};
        int[] output = new int[input.length];
        int pos = 0;
        int neg = 1;
        for (int val: input) {
            if (val >= 0) {
                output[pos] = val;
                pos += 2;
            } else {
                output[neg] = val;
                neg += 2;
            }
        }
        for (Integer t : output) {
            list1.add(t);
        }
        return list1;
    }*/


     public List<Integer> reArrangePosAndNegNumber() {
        List<Integer> list1 = new ArrayList<Integer>();
        int[] input = {8,-2,3,9,5,-6,7,1,4};

        int[] output = new int[input.length];
        int pos = 0;
        int neg = 1;
        for (int val: input) {
            if (val >= 0 && pos<=input.length) {
                output[pos] = val;
                pos += 2;
            } else {
                output[neg] = val;
                neg += 2;
            }
        }
        for (Integer t : output) {
            list1.add(t);
        }
        return list1;
    }

}
