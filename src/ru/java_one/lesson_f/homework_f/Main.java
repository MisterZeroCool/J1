package ru.java_one.lesson_f.homework_f;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        //String separator = File.separator;
        String pathFile1 = "src/ru/java_one/lesson_f/homework_f/file_a";
        String pathFile2 = "src/ru/java_one/lesson_f/homework_f/file_b";

        File f1 = new File(pathFile1);
        File f2 = new File(pathFile2);

        //text.glueTogether(f1,f2);
        text.checkWord("There",f1);
        text.checkWord("school",f2);
    }
}
