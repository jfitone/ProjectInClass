package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        try {
            File myFile = new File("ArrayIn.txt");
            Scanner inputFile = new Scanner(myFile);

            ArrayList<Double> list = new ArrayList<>();
            list.add(0, inputFile.nextDouble());
            list.add(1, inputFile.nextDouble());
            list.add(2, inputFile.nextDouble());
            list.add(3, inputFile.nextDouble());
            list.add(4, inputFile.nextDouble());


            FileWriter fw = new FileWriter("MedianOut.txt", false);
            PrintWriter outfile = new PrintWriter(fw);
            outfile.print("median"); //needs to print a variable containing the median
            outfile.close();


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        }

}

/*for(int i =0; i<list.size(); i++){
                System.out.println(list.get(i)) */