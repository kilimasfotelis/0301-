package com.kcs.uzd.pask3.utils;

import java.util.List;

/**
 * Created by User on 2017-03-01.
 */
public class MyUtils {
    public static <E> void printList(List<E> list){
        for (E e : list){
            System.out.println(e);
        }
    }

}
