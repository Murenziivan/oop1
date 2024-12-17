/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopexc;

import java.io.*;

public class IOExceptionEx {
    public static void main(String[] args) {
        try {
            // Trying to read from a non-existent file
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            // Handle the IOException
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}