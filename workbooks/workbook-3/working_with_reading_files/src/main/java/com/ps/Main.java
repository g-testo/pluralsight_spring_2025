package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    static String songFromFile = "";

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("song.txt"));
            String line;

            while((line = bufferedReader.readLine()) != null){
                songFromFile += line;
            }

            System.out.println(songFromFile.length());

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}