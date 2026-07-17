class Variables{
  public static void main(String []args){

    //used to store whole numbers
    int a = 10; //ranges from -2,147,483,648 to 2,147,483,647
    short b = 20;//ranges from -32,768 to 32,767
    byte c = 30;//  ranges from -128 to 127
    long d = 40;//ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


  //used for storing decimal numbers
    float e = 50.5f; //ranges from 1.4e-45 to 3.4028235e38 and requires an 'f' at the end of the number to indicate that it is a float and round to 7 decimal places

    float floatMin = Float.MIN_VALUE; //1.4e-45
    float floatMax = Float.MAX_VALUE; //3.4028235e38

    double f = 60.6; //ranges from 4.9e-324 to 1.7976931348623157e308
    double doubleMin = Double.MIN_VALUE; //4.9e-324
    double doubleMax = Double.MAX_VALUE; //1.7976931348623157e308

    //used for storing single characters
    char g = 'A'; //ranges from 0 to 65,535

    //used for storing true or false values
    boolean h = true; //values can be either true or false


    //typecasting variables

    char charValue = 'n';
    System.out.println("ascii value of n is : "+(int)charValue); //prints the ASCII value of the character 'n'

    System.out.println("Integer value: " + a);
    System.out.println("Short value: " + b);
    System.out.println("Byte value: " + c);
    System.out.println("Long value: " + d);
    System.out.println("Float value: " + e);
    System.out.println("Double value: " + f);
    System.out.println("Character value: " + g);
    System.out.println("Boolean value: " + h);
  }
}