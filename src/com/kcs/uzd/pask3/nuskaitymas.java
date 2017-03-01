package com.kcs.uzd.pask3;

import java.io.*;

/**
 * Created by User on 2017-03-01.
 */
public class nuskaitymas {
    public static void main(String[] args) {
        readFile("persons.txt");
    }

    private static void readFile(String fileName) {
        File file = new File(fileName);
        try {
            FileReader reader = new FileReader(file);
            //BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)));
            BufferedReader bf = new BufferedReader(reader);
            String name = null;
            try {
                while ((name = bf.readLine()) != null){
                    System.out.println(name);
                }
            } catch (IOException e) {
                System.out.println("can't read line");
            }finally {
                try {
                    bf.close();
                } catch (IOException e) {
                    System.out.println("can't close reader");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ner failo - " + fileName);
        }
        // BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)));
    }
}
