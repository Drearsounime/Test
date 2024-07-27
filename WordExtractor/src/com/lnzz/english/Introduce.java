package com.lnzz.english;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Introduce {
    public void introduceTest(){
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("introduce.txt");
        String content = null;
        try {
            content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(content);
    }
}
