package com.lnzz.english;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static com.lnzz.english.dictation.Test.dictationDemo;
import static com.lnzz.english.file.ConfigFile.readContent;
import static com.lnzz.english.file.ConfigFile.writer;
import static com.lnzz.english.file.NewFile.newFile;
import static com.lnzz.english.file.ReadFile.readWord;

public class Main {
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> translate = new ArrayList<>();
        File file = new File("library");
        if(!file.exists()){
            file.mkdir();
        }
        Introduce introduce = new Introduce();
        introduce.introduceTest();
        System.out.println("欢迎来到单词默写");
        System.out.println("输入1开始默写，输入2创建文件，输入3创建配置文件，输入0退出");
        bw:
        while (true){
            System.out.println("请输入功能相对应选项");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("输入要报写的次数,满分一百分,最好输入能被100整除的数,以防总分出错");
                    int n = sc.nextInt();
                    readContent();
                    readWord(arr,translate);
                    dictationDemo(arr,translate,n);
                    System.out.println("输入任意的字符结束");
                    String str = sc.next();
                    break bw;
                case 2:
                    newFile(2);
                    break;
                case 3:
                    writer();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("The thing you entered does not match.");
                    break;
            }
        }

    }
}
