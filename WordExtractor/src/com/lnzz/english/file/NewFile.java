package com.lnzz.english.file;

import java.io.*;

import static com.lnzz.english.Main.sc;

public class NewFile {
    public static String[] configArr = new String[2];

    public static void newFile(int a) {
        System.out.println("请输入文件名，不能是文件夹，不能有后缀名");
        String name = sc.next();
        String wordURL = "library\\" + name + ".txt";
        String translate = "library\\" + name + "Translate.txt";
        File file1 = new File(wordURL);
        File file2 = new File(translate);
        configArr[0] = wordURL;
        configArr[1] = translate;
        try {
            if(!file1.exists()){
                file1.createNewFile();
                file2.createNewFile();
                System.out.println("创建成功");
            }else {
                System.out.println("已存在该文件,无法创建相同文件!!!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}


