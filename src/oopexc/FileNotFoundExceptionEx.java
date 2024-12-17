/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopexc;

import java.io.*;

public class FileNotFoundExceptionEx {
    public static void main(String[] args) {
        try {
            // Attempting to open a file that does not exist
            FileReader file = new FileReader("missingfile.txt");
        } catch (FileNotFoundException e) {
            // Handle the exception
            System.out.println("File not found: " + e.getMessage());
        }
    }
}