/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prery Doll
 */
public class TempConverter {
    
    
    
     public static void main (String[] args)
     {
           final int BASE = 32;      
     final double CONVERSION_FACTOR = 9.0 / 5.0;
     
      double fahrenheitTemp;      
      int celsiusTemp = 24;  // value to convert
      fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
      System.out.println ("Celsius Temperature: " + celsiusTemp);      
      System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp); 
    
     }
}
