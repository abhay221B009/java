public class sstring{
  public static void main(String[] args) {
     String s1 = "Hello";//using string literal
     String s2  = new String("World");///using constructor

     System.out.println(s1);
     System.out.println(s2);

     //string pool vs heap memory:  
     //String pool is a special memory region where string literals are stored. When a string literal is created, the JVM checks if an identical string already exists in the pool. If it does, the reference to that string is returned instead of creating a new object. This helps save memory and improve performance.
     //Heap memory is a general-purpose memory area where objects are stored. When a new string object is created using the new keyword, it is stored in the heap memory, even if an identical string already exists in the string pool. This means that multiple string objects with the same value can exist in the heap memory.
  }
}