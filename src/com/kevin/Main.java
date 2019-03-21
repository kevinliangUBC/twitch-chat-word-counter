package com.kevin;

import java.io.*;
public class Main

{
    public static void main(String[] args)throws Exception
    {

//        File file = new File("//Users//kevinliang//dev//test.txt");
        File file = new File("//Users//kevinliang//dev//Twitch-Chat-Downloader//output//doublelift//v397725816.txt");



        BufferedReader br = new BufferedReader(new FileReader(file));
        FileWriter fileWriter = null;

        try {
            File outFile = new File("//Users//kevinliang//Desktop//outTest.txt");
            fileWriter = new FileWriter(outFile);
//            fileWriter.write("This is ");
//            fileWriter.write("\n");
//            fileWriter.write("a test");
//            fileWriter.flush();
//            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
            String text = st.replaceAll("[^a-zA-Z]", " ");
            String text2 = text.toLowerCase();
            String text3 = text2.trim().replaceAll(" +", " ");
            System.out.println(text3);
            String text4 = text3.trim().replaceAll(" +", ",");

            fileWriter.write(text4);
            fileWriter.write("\n");

        }

        fileWriter.flush();
        fileWriter.close();






    }







}