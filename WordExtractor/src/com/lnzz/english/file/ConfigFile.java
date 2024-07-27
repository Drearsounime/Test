package com.lnzz.english.file;

import java.io.*;
import java.util.ArrayList;

import static com.lnzz.english.file.NewFile.configArr;

public class ConfigFile {
    public static File configFile = new File("config.txt");
    public static ArrayList<String> configArrL = new ArrayList<>();
    public static void writer(){
        if(!configFile.exists()){
            try {
                configFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        writerContent();
    }

    private static void writerContent(){

        try {
            FileReader fr =new FileReader(configFile);
            BufferedReader br = new BufferedReader(fr);
            String tmp = null;
            if((tmp = br.readLine()) == null){
                FileWriter fw = new FileWriter(configFile);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < configArr.length; i++) {
                    bw.write(configArr[i]);
                    bw.newLine();
                }
                bw.close();
                fw.close();
            }
            br.close();
            fr.close();
            System.out.println("配置文件“config.txt创建完毕");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readContent(){
        try {
            FileReader fr = new FileReader(configFile);
            BufferedReader br = new BufferedReader(fr);
            String tmp = null;
            while ((tmp = br.readLine()) != null){
                configArrL.add(tmp);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
