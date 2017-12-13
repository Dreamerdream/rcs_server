package com.juphoon.rcsrunner.util;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/12.
 * @Description: 生成16位随机字符串
 */
public class RandomUtil {
    private final static char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P','Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z','a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            '-','.','!','%','*','_','+','~','(',')','<','>','[',']','{','}',
            '0','1','2','3','4','5','6','7','8','9'};




    public static String generate() {

        boolean[] flags = new boolean[letters.length];
        char[] chs = new char[16];
        for (int i = 0; i < chs.length; i++) {
            int index;
            do {
                index = (int) (Math.random() * (letters.length));
            } while (flags[index]);// 判断生成的字符是否重复
            chs[i] = letters[index];
            flags[index] = true;
        }
        return new String(chs);
    }
}
