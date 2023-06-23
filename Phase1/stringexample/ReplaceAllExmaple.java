package stringexample;

import java.io.*;
public class ReplaceAllExmaple {
   public static void main(String args[]) {
      String Str = new String("Welcome to India Indian  Indi");
      System.out.print("Return Value :" );
      System.out.println(Str.replaceAll("Ind(.*)", "Bharat"));
      System.out.println("Hello");
   }
}