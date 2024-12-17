/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopexc;

public class NullPointerExceptionEx{
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // Accessing a null reference
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }
    }
}