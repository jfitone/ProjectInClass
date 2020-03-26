package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class InClass {

    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("out.txt");
            PrintWriter outputFile = new PrintWriter(fw);
            outputFile.println("out.txt");
            File myFile = new File("Array.txt");
            Scanner inputFile = new Scanner(myFile);
            System.out.println(inputFile.hasNext());
            outputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        ArrayList<Double> out = new ArrayList<>();
        out.add(0, 80.0);
        out.add(1, 5.0);
        out.add(2, 34.1);
        out.add(3, 68.0);
        out.add(4, -2.0);
        for (int i = 0; i < out.size(); i++) {
            System.out.println(out.get(i));
        }
    }
}
