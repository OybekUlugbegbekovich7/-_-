package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String string1 = reader.readLine();
    String string2 = reader.readLine();
    reader.close();
    BufferedReader read = new BufferedReader(new FileReader(string1));
    BufferedWriter writer = new BufferedWriter(new FileWriter(string2));
        List<String> list = new ArrayList<String>();


    while(read.ready())
    {
        String [] dog = read.readLine().split(" ");
        for (String barbossa : dog)
        {
            double dhl = Double.parseDouble(barbossa);
            long pasy = Math.round(dhl);
            writer.write(pasy + " ");
        }
    }

        read.close();
        writer.close();
    }
}
