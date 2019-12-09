package com.example.demo.guava;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author qiaodexin@yunzhangfang.com
 * @date 2019/12/9 14:47
 */
public class Collection {

    public static void main(String[] args) {
        ImmutableList<String> CODE_LIST = ImmutableList.of("31", "11", "33", "43", "3302", "44", "4403", "36", "37", "50");
        if(CODE_LIST.contains("11")){
            System.out.println("yes");
        }

        ImmutableSet<String> of = ImmutableSet.of("a", "a", "b");
        System.out.println(of.toString());
    }
}
