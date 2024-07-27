package com.lnzz.english.dictation;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void dictationDemo(ArrayList<String> words, ArrayList<String> translate, int n) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> wordsTemp = new ArrayList<>();
        ArrayList<String> translateTemp = new ArrayList<>();
        ArrayList<String> wordTemp = new ArrayList<>();
        System.out.println("开始默写，看中文写英文");
        int num = 100;
        int a = 100 / n;
        for (int i = 1; i <= n; i++) {
            int e;
            String s;
            while (true) {
                e = r.nextInt(0, translate.size());
                s = translate.get(e);
                if (!arr.contains(s)) {
                    arr.add(s);
                    break;
                }
            }
            System.out.println(s);
            String st = sc.next();
            if (!st.equals(words.get(e))) {
                wordsTemp.add(st);
                wordTemp.add(words.get(e));
                translateTemp.add(s);
                num -= a;
            }
        }
        if (num != 100) {
            System.out.println("你的默写分数为" + num + "分");
            int sum = 0;
            for (int i = 0; i < wordsTemp.size(); i++) {
                System.out.println("错误单词:" + wordsTemp.get(i) + "---正确单词:" + wordTemp.get(i) + "---中文:" + translateTemp.get(i));
                sum++;
            }
            System.out.println("你共错了" + sum + "个");
        } else {
            System.out.println("恭喜你默写全部正确");
        }

    }
}
