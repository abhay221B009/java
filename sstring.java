public class Sstring {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = new String("World");

    System.out.println(s1);
    System.out.println(s2);

    String a = "Hello";
    String upperA = a.toUpperCase();
    System.out.println(a);

    String b = upperA;
    System.out.println(b);

    a = upperA;
    System.out.println(a);

    String str = "Hello World";
    char ch = str.charAt(4);
    System.out.println(ch);

    System.out.println(str.substring(0, 5));

    String str1 = "Hello World";
    System.out.println(str1.contains("Hello"));
    System.out.println(str1.startsWith("Hello"));
    System.out.println(str1.endsWith("World"));

    String str2 = "Hello World";
    String str3 = str2.replace("World", "Java");
    System.out.println(str3);
  }
}