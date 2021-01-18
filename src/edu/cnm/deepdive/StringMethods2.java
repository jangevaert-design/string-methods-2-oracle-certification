package edu.cnm.deepdive;

public class StringMethods2 {

  public static void main(String[] args) {
    String str = "java";
    String str2 = "Java";
    String str3 = "ja";

    System.out.println("\n" + str.equals(str2));//will print false because the char J is different than j.
    System.out.println(str.equalsIgnoreCase(str2));//will print true.
    System.out.println("abc".equalsIgnoreCase("ABC"));//will print true.

    //startsWith() and endsWith()
    System.out.println("\n" + str.startsWith("j"));//true
    System.out.println(str.startsWith(str3));//true
    System.out.println(str.startsWith("J"));//false
    System.out.println(str.startsWith("J".toLowerCase()));//true
    System.out.println(str.endsWith("va"));//true

    //contains()
    System.out.println("\n" + str.contains(str3));//true
    System.out.println(str.contains("av"));//true
    System.out.println("Java".contains("j"));//false
    System.out.println("Java".contains("j".toUpperCase()));//true

    //replace
    String myString = "Java" + " " + "is" + " " + "cool";
    System.out.println("\n" + myString.replace('a', 'A'));//prints JAvA is cool
    System.out.println(myString.replace(" ", "_"));//prints Java_is_cool
    System.out.println(myString.replace("is", "_"));//prints Java _ cool
    System.out.println(str);// prints the String on line 28 since Strings are immutable.

    //trim()
    System.out.println("\n Java is cool ");
    System.out.println(" Java is cool ".trim());// trims the space at the beginning end the end.


  }
}
