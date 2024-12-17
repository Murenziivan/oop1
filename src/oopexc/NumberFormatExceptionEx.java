/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopexc;

public class NumberFormatExceptionEx {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // Invalid string format for number
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e.getMessage());
        }
    }
}
