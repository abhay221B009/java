public class Bitwise {
  public static void main(String[]args){
    int a = 5;
    System.out.println(Integer.toBinaryString(a));
    //bitwise operators can only be used with integer types (byte, short, int, long) and char. They cannot be used with floating-point types (float, double) or boolean types.

    //types:
    //and & 
    //or |
    //xor ^
  //not ~
    //left shift <<
    //right shift >>
    //unsigned right shift
    //bitwise operators are used to perform operations on individual bits of binary numbers. They are commonly used in low-level programming, such as manipulating flags, masks, and performing bitwise calculations.
    int x = 5;
    System.out.println(Integer.toBinaryString(x));
    int y = x << 2;
    System.out.println(Integer.toBinaryString(y));

    int m = 10;
    System.out.println(Integer.toBinaryString(m));
    int n = m >> 1;
    System.out.println(Integer.toBinaryString(n));

    int p = 10;
    System.out.println(Integer.toBinaryString(p));
    int q = p >>> 1;
    System.out.println(Integer.toBinaryString(q));
  }
}
