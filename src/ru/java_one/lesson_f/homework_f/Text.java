package ru.java_one.lesson_f.homework_f;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text {
    File f1;
    File f2;

    public void glueTogether(File f1, File f2){
        try (FileWriter writer = new FileWriter(f1,true);
             FileReader reader = new FileReader(f2)){
            int c;
            while((c = reader.read()) != -1){
                writer.write(c);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void checkWord(String checkWord,File f1) {
        try(FileReader reader = new FileReader(f1);
            Scanner scannerFile = new Scanner(f1)) {
            while(scannerFile.hasNext()){
                String searchWord = scannerFile.next();
                System.out.println("Search word:"+checkWord);
                if(searchWord.equalsIgnoreCase(checkWord)){
                    System.out.println("Found: " + checkWord);
                    break;
                }else {
                    System.out.println("no");
                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

