package com.example.demo.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author qiaodexin@yunzhangfang.com
 * @date 2019/12/9 14:59
 */
public class JoinerUtil {

    public static void main(String[] args) {
        ImmutableList<String> list = ImmutableList.of("a", "bb", "ccc");
        String join = Joiner.on(",").join(list);
        System.out.println(join);

        String str = "a, ,bb  ,cc,";
        //omitEmptyStrings过滤空字符串
        List<String> strings = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(str);

        //trimResults过滤前后空格
        String str1 = " a, ,bb  ,cc,";
        Splitter on = Splitter.on(",");
        List<String> strings1 = on.trimResults().splitToList(str1);
        System.out.println(strings1.toString());
    }
}
