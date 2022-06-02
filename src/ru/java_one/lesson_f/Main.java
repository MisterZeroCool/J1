package ru.java_one.lesson_f;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static int method1(int a, int b) throws ArithmeticException {
        return a / b;
    }

    private static void method2() throws IOException, ArithmeticException {
        //write on flashdrive
        // read

        // ejected
        throw new IOException();
    }

    public static void main(String[] args) {
        // Wrappers
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("file.txt", true));
            ps.println("HelloWorld");
            ps.close();

            Scanner sc = new Scanner(new FileInputStream("file.txt"));
            System.out.println(sc.next());
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ioExample() {
        InputStream in;
        OutputStream out;

        try {
            FileInputStream fis = new FileInputStream("file.txt");
            int b;
            while ((b = fis.read()) != -1)
                System.out.print((char) b);

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outExample() throws IOException {
        OutputStream out;
        out = new FileOutputStream("file.txt", true);
        byte[] bytes = "\n Hello world \n long string here".getBytes();

        out.write(bytes);
        out.flush();
        out.close();
    }

    private static void exceptionsExample() {
        try {
            System.out.println(method1(5, 0));
            method2();

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(5);
        } catch (IOException e) {
            System.out.println("IOE!");
        }
    }

    private static void builderExample() {
        String s0 = "Example";
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            s0 += i;
        }
        float deltaTime = (System.nanoTime() - startTime) * 0.000000001f;
        System.out.println(deltaTime + " sec");

        StringBuilder sb = new StringBuilder("Example");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        deltaTime = (System.nanoTime() - startTime) * 0.000000001f;
        System.out.println(deltaTime + " sec");


        System.out.println(s0.equals(sb.toString()));
    }

    private static void stringExample() {
        Scanner sc = new Scanner(System.in);
        String s0 = "hello"; // new String("hello");
        String s1 = "hello";
        String s2 = "he";
        String s3 = "llo";
        String s4 = s2 + s3; // new String(s2+s3);
        String s5 = sc.next();

        System.out.println(s0.equals(s1));
        System.out.println(s0.equals(s4));
        System.out.println(s0.equals(s5));
    }
}
