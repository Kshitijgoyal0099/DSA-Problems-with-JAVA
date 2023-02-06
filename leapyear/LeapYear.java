/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapyear;

import java.util.*;

/**
 *
 * @author kkgoy
 */
public class LeapYear {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // year to be checked
    int year;
     System.out.println("Please Enter a year:");
        year=sc.nextInt(); 
    boolean leap = false;
   if (year % 4 == 0) {
       if (year % 100 == 0) {
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }      
      else
        leap = true;
    }    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
    }
}
