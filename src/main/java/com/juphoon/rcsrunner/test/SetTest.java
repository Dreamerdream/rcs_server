package com.juphoon.rcsrunner.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/12.
 * @Description:
 */
public class SetTest {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("fgh");
        Iterator<String> iterator = set.iterator();
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
