package stringexample;

/*Create a regular expression that accepts alphanumeric characters only.  
Its length must be six characters long only.*/  
  
import java.util.regex.*;  
class RegExpExample1{  
public static void main(String args[]){  
System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched) 
System.out.println(Pattern.matches("011-[0-9]{8}", "011-53038949"));
}}  

//[range]{length}