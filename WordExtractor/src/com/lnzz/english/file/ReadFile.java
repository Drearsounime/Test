package com.lnzz.english.file;

import java.io.*;
import java.util.ArrayList;

import static com.lnzz.english.file.ConfigFile.configArrL;

public class ReadFile {
    public static void readWord(ArrayList<String> words,ArrayList<String> translate){

        try {
            File file = new File(configArrL.get(0));
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String tmp = null;
                while ((tmp = br.readLine()) != null){
                    words.add(tmp);
                }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        readTranslate(translate);
    }

    private static void readTranslate(ArrayList<String> translate){

        try {
            File file = new File(configArrL.get(1));
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String tmp = null;
                while ((tmp = br.readLine()) != null){
                    translate.add(tmp);
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
