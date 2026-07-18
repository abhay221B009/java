public class sstring{
  public static void main(String[] args) {
     String s1 = "Hello";//using string literal
     String s2  = new String("World");///using constructor

     System.out.println(s1);
     System.out.println(s2);

     //string pool vs heap memory:  
     //String pool is a special memory region where string literals are stored. When a string literal is created, the JVM checks if an identical string already exists in the pool. If it does, the reference to that string is returned instead of creating a new object. This helps save memory and improve performance.
     //Heap memory is a general-purpose memory area where objects are stored. When a new string object is created using the new keyword, it is stored in the heap memory, even if an identical string already exists in the string pool. This means that multiple string objects with the same value can exist in the heap memory.



     String a = "Hello";
     a.toUpperCase(); //this will not change the value of a because strings are immutable in Java. Instead, it will return a new string with the uppercase value.
     System.out.println(a); //prints Hello

     String b = a.toUpperCase(); //this will create a new string with the uppercase value of a and assign it to b
     System.out.println(b); //prints HELLO

     //we can do this also by reiniatilizing the variable a with the new value
     a = a.toUpperCase(); //this will create a new string with the uppercase value
      System.out.println(a); //prints HELLO



      //accecssing a particular character in a string using charAt() method
      String str = "Hello World";
      char ch = str.charAt(4); //this will return the character at index 4 of the string str
      System.out.println(ch); //prints o

      //accessin a substring from a string using substring() method
      System.out.println(str.substring(0,5));


      //contains, startsWith, endsWith methods
      String str1 = "Hello World";
      System.out.println(str1.contains("Hello")); //prints true
      System.out.println(str1.startsWith("Hello")); //prints true
      System.out.println(str1.endsWith("World")); //prints true


      //replace method
      String str2 = "Hello World";  
    String str3 = str2.replace("World", "Java"); //this will replace the word World with Java in the string str2 and return a new string
    System.out.println(str3); //prints Hello Java
    
  }
}